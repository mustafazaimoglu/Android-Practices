package com.example.buttonkontrolkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //    var degistir = findViewById<Button>(R.id.degistir)
    //    var yazi = findViewById<TextView>(R.id.yazi)
    }

    fun degistir(view: View) {
        yazi.text = "MUSTAFA"
    }


}