package com.izzzya.storybookapp

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.izzzya.storybookapp.adapter.Book
import java.time.LocalDate

class SharedPrefs(context: Context) {

    init {
        sharedPref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)

    }
    companion object{
        private var sharedPref: SharedPreferences? = null
        const val PREFERENCES = "prefs"
        private const val ONB_COMPLETE: Boolean = false
        var book: Book? = null
        //избранное
        private val ITEM_LIST: Set<String> = hashSetOf()
        private var newItemSet: MutableSet<String> = ITEM_LIST.toMutableSet()
        fun setNewItemToSet(newItem: String) {
            newItemSet.add(newItem)
            val editor = sharedPref?.edit()
            editor?.putStringSet("ITEM_LIST", newItemSet)
            editor?.apply()
        }
        fun removeItemFromSet(newItem: String) {
            newItemSet.remove(newItem)
            val editor = sharedPref?.edit()
            editor?.putStringSet("ITEM_LIST", newItemSet)
            editor?.apply()
        }
        fun getItemSet(): MutableSet<String>?{
            return sharedPref?.getStringSet("ITEM_LIST", ITEM_LIST)
        }


        fun setOnb(t: Boolean){
            sharedPref?.edit()
                ?.putBoolean("ONB_COMPLETE", t)
                ?.apply()
        }

        fun getOnb(): Boolean? {
            return sharedPref?.getBoolean("ONB_COMPLETE",false)

        }

    }
}