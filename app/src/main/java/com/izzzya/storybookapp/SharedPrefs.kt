package com.izzzya.storybookapp

import android.content.Context
import android.content.SharedPreferences
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
        private const val WEEK: Int = 0
        var date: LocalDate = LocalDate.now()
        var book: Book? = null

        fun setOnb(t: Boolean){
            sharedPref?.edit()
                ?.putBoolean("ONB_COMPLETE", t)
                ?.apply()
        }

        fun getOnb(): Boolean? {
            return sharedPref?.getBoolean("ONB_COMPLETE",false)

        }
        fun setWeek(t: Int){
            sharedPref?.edit()
                ?.putInt("WEEK", t)
                ?.apply()
        }

        fun getWeek(): Int? {
            return sharedPref?.getInt("WEEK", 0)

        }
    }
}