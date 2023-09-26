package com.izzzya.storybookapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.izzzya.storybookapp.R

class TagAdapter(private val context: Context?,
                 private val dataset: List<String>
): RecyclerView.Adapter<TagAdapter.favsViewHolder>() {

    class favsViewHolder(view: View) : RecyclerView.ViewHolder(view!!) {
        val tag = view.findViewById<Button>(R.id.tagBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): favsViewHolder {
        val mLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.tag_item, parent, false)
        return favsViewHolder(mLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: favsViewHolder, position: Int) {
        holder.tag.text = dataset[position]
    }
}