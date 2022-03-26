package dev.mkz.spinnerkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorArr = arrayOf("Red","Green","Cyan","Black","Orange","Blue","Gray")
        val adapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,colorArr)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var element = parent?.getItemAtPosition(position).toString()
                textBox.text = element
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }

        }

    }
}