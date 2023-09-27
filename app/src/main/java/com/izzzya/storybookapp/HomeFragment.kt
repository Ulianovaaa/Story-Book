package com.izzzya.storybookapp

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.izzzya.storybookapp.adapter.Book
import com.izzzya.storybookapp.adapter.BooksAdapter
import com.izzzya.storybookapp.adapter.DataSource
import com.izzzya.storybookapp.adapter.FavAdapter

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val themesGroup = view.findViewById<RadioGroup>(R.id.themesRadio)

        val booksRV = view.findViewById<RecyclerView>(R.id.booksRV)
        val llm = LinearLayoutManager(requireContext())
        llm.orientation = LinearLayoutManager.HORIZONTAL
        booksRV.layoutManager = llm
        booksRV.setHasFixedSize(true)
        var books = DataSource.booksList
        fun getBooks(){
            booksRV.adapter = BooksAdapter(requireContext(), books)
        }
        getBooks()

        themesGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
                when(p1){
                    R.id.allBooksradBtn -> {
                        books = DataSource.booksList
                        getBooks()
                    }
                    R.id.recommendedRadioBtn -> {
                        books = DataSource.booksList.filter { it.title.lowercase().contains("чек пук")  }
                        getBooks()
                    }
                    R.id.popularRadBtn -> {
                        books = DataSource.booksList.filter { it.title.lowercase().contains("w") }
                        getBooks()
                    }
                    R.id.choiceRadBtn -> {
                        books = DataSource.booksList.filter {   it.title.lowercase().contains("чек пук") }
                        getBooks()
                    }

                }
            }
        })

        val favesRV = view.findViewById<RecyclerView>(R.id.favsRV)
        val fllm = LinearLayoutManager(requireContext())
        fllm.orientation = LinearLayoutManager.VERTICAL
        favesRV.layoutManager = fllm
        favesRV.setHasFixedSize(true)
        val faves: MutableList<Book>  = mutableListOf()
        for (item in DataSource.booksList){
            if (SharedPrefs.getItemSet()!!.contains(item.title)){
                faves.add(item)
            }
        }
        favesRV.adapter = FavAdapter(requireContext(), faves)
    }

    companion object {

    }
}