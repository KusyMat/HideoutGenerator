package com.example.misiaczki.myapplication1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.Random


const val EXTRA_MESSAGE = "com.example.misiaczki.myapplication1"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateEasy ( view: View) {
        val hideouts: MutableList<Int> = mutableListOf(38, 37, 32, 31, 52, 53, 25, 43, 60, 61, 79, 114, 115, 137, 135, 175, 165, 167, 177, 178, 179, 189, 121, 122,
                                                       141, 124, 186, 187, 193, 194, 127, 89, 90, 91, 92, 93, 108, 94, 75)
        val generatedHideout = (hideouts[Random().nextInt(hideouts.size)]).toString()
        val intent = Intent(this, ShowHideoutNumber::class.java).apply {
            putExtra(EXTRA_MESSAGE, generatedHideout)
        }
        startActivity(intent)
    }
    fun generateMedium ( view: View) {
        val hideouts: MutableList<Int> = mutableListOf(24, 6, 7, 8, 10, 12, 13, 15, 16, 14, 33, 36, 35, 39, 49, 50, 59, 78, 97, 95, 116, 117, 96, 112, 113, 176, 151,
                                                       166, 190, 191, 180, 154, 140, 168, 169, 170, 181, 182, 192, 183, 184, 195, 173, 160, 131, 69, 70, 71, 72, 87,
                                                       129, 128, 132, 110, 104, 105, 106, 107, 88, 109, 74, 76)

        val generatedHideout = (hideouts[Random().nextInt(hideouts.size)]).toString()
        val intent = Intent(this, ShowHideoutNumber::class.java).apply {
            putExtra(EXTRA_MESSAGE, generatedHideout)
        }
        startActivity(intent)
    }
    fun generateHard ( view: View) {
        val hideouts: MutableList<Int> = mutableListOf(1, 17, 18, 22, 77, 118, 119, 120, 98, 34, 55, 56, 57, 68, 123, 125, 155, 144, 145, 150, 188, 73, 19, 54, 152,
                                                       153, 30, 58, 64, 62, 80, 101, 102, 103, 126, 156, 130, 161)
        val generatedHideout = (hideouts[Random().nextInt(hideouts.size)]).toString()
        val intent = Intent(this, ShowHideoutNumber::class.java).apply {
            putExtra(EXTRA_MESSAGE, generatedHideout)
        }
        startActivity(intent)
    }
}
