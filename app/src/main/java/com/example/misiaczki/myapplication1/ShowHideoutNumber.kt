package com.example.misiaczki.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ShowHideoutNumber : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_hideout_number)
        showHideoutNumber()
    }

    private fun showHideoutNumber() {
        val hideoutNumber = findViewById<TextView>(R.id.hideoutNumber)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        hideoutNumber.text = message
    }
}