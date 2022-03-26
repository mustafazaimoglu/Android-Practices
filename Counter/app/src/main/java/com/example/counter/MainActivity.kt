package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter:Int = 0
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    fun increaseCounter(view: View){
        counter++

        textView.text = counter.toString();
    }

    fun decreaseCounter(view: View){
        counter--

        textView.text = counter.toString();
    }
}