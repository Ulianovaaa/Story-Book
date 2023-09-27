package com.izzzya.storybookapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.izzzya.storybookapp.adapter.TagAdapter


class BookDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val source = SharedPrefs.book!!

        view.findViewById<ImageView>(R.id.bookCoverIV).setImageResource(source.cover)
        view.findViewById<TextView>(R.id.bookTitleTV).text = source.title
        view.findViewById<TextView>(R.id.bookDescTV).text = source.description

        val favBtn = view.findViewById<ImageButton>(R.id.addToFavBtn)
        favBtn.background = when(SharedPrefs.getItemSet()!!.contains(source.title)){
            true -> resources.getDrawable(R.drawable.save)
            else ->resources.getDrawable(R.drawable.save_blank)
        }

        view.findViewById<ImageButton>(R.id.backBtn).setOnClickListener {
            findNavController().popBackStack()
        }
//        Log.i("favs: ", SharedPrefs.getItemSet()!!.toString())
        favBtn.setOnClickListener {
         if (SharedPrefs.getItemSet()!!.contains(source.title)){
             SharedPrefs.removeItemFromSet(source.title)
//             Log.i("favs: ", SharedPrefs.getItemSet()!!.toString())
             favBtn.background =resources.getDrawable(R.drawable.save_blank)
         }else{
             SharedPrefs.setNewItemToSet(source.title)
//             Log.i("favs: ", SharedPrefs.getItemSet()!!.toString())
             favBtn.background =resources.getDrawable(R.drawable.save)
         }
        }


        view.findViewById<ImageButton>(R.id.optionsBtn).setOnClickListener {
            Toast.makeText(requireContext(), "V razrabotke!", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Button>(R.id.readBookBtn).setOnClickListener {
            findNavController().navigate(R.id.action_global_readFragment)
        }

        val rv = view.findViewById<RecyclerView>(R.id.bookThemesRV)
        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.HORIZONTAL
        rv.layoutManager = llm
        rv.setHasFixedSize(true)
        rv.adapter = TagAdapter(context, source.tags)

    }

    companion object {

    }
}