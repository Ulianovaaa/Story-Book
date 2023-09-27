package com.izzzya.storybookapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.izzzya.storybookapp.R
import com.izzzya.storybookapp.SharedPrefs

class FavAdapter(private val context: Context?,
                 private val dataset: List<Book>
): RecyclerView.Adapter<FavAdapter.favesViewHolder>() {

    class favesViewHolder(view: View): RecyclerView.ViewHolder(view!!){
        val img = view.findViewById<ImageView>(R.id.bcoverIV)
        val header = view.findViewById<TextView>(R.id.bTitleTV)
        val author = view.findViewById<TextView>(R.id.authorTV)
        val tags = view.findViewById<RecyclerView>(R.id.btagsRV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): favesViewHolder {
        val mLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.fav_item, parent, false)
        return favesViewHolder(mLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: favesViewHolder, position: Int) {
        val book = dataset[position]

        holder.img.setImageResource(book.cover)
        holder.header.text = book.title
        holder.author.text = book.author

        val rv = holder.tags
        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.HORIZONTAL
        rv.layoutManager = llm
        rv.setHasFixedSize(true)
        rv.adapter = TagAdapter(context, book.tags)

        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                SharedPrefs.book = book
                p0!!.findNavController().navigate(R.id.action_global_bookDetailsFragment)
            }
        })
    }
}