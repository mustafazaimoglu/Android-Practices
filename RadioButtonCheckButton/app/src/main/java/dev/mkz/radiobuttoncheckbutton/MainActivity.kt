package dev.mkz.radiobuttoncheckbutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxToast.setOnClickListener {
            var text = "Checked Boxes : "
            if (checkBox.isChecked) {
                text += "1, "
            }
            if (checkBox2.isChecked) {
                text += " 2, "
            }
            if (checkBox3.isChecked) {
                text += " 3"
            }

            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        }

        radioButtonToast.setOnClickListener {
            var text = "Checked Radio Button : "
            if (radioButton.isChecked) {
                text += "1"
            }
            if (radioButton2.isChecked) {
                text += "2"
            }
            if (radioButton3.isChecked) {
                text += "3"
            }
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        }

        radioButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textView.setTextColor("#0000ff".toColorInt())
            }
        }
        radioButton2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textView.setTextColor("#00ff00".toColorInt())
            }
        }
        radioButton3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textView.setTextColor("#ff0000".toColorInt())
            }
        }
    }
}