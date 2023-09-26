package com.izzzya.storybookapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.izzzya.storybookapp.R
import com.izzzya.storybookapp.SharedPrefs

class BooksAdapter(private val context: Context?,
                   private val dataset: List<Book>
): RecyclerView.Adapter<BooksAdapter.booksViewHolder>() {

    class booksViewHolder(view: View): RecyclerView.ViewHolder(view!!){
        val img = view.findViewById<ImageView>(R.id.coverIV)
        val header = view.findViewById<TextView>(R.id.titleTV)
        val tags = view.findViewById<RecyclerView>(R.id.tagsRV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): booksViewHolder {
        val mLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_item, parent, false)
        return booksViewHolder(mLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: booksViewHolder, position: Int) {
        val book = dataset[position]

        holder.img.setImageResource(book.cover)
        holder.header.text = book.title

        val rv = holder.tags
        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.HORIZONTAL
        rv.layoutManager = llm
        rv.setHasFixedSize(true)
        rv.adapter = TagAdapter(context, book.tags)

        holder.itemView.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                SharedPrefs.book = book
                p0!!.findNavController().navigate(R.id.action_global_bookDetailsFragment)
            }
        })
    }
}