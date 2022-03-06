package com.example.mycalendar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarView = findViewById<androidx.gridlayout.widget.GridLayout>(R.id.my_calendar)
        for (i in 0..31) {
            val dateView = TextView(this)
            dateView.layoutParams = ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
                100,
                100
            )
            dateView.text = i.toString()
            dateView.background = getDrawable(R.drawable.edge)
            calendarView.addView(dateView)
        }
    }
}