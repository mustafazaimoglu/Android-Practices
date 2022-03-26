package dev.mkz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext,"Açık",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext,"Kapalı",Toast.LENGTH_SHORT).show()
            }
        }

        switchButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext,"Açık",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext,"Kapalı",Toast.LENGTH_SHORT).show()
            }
        }
    }
}