package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number1: Int? = null
    var number2: Int? = null
    var result: Int? = null
    private lateinit var editTextNumber: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var resultText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber = findViewById(R.id.editTextNumber)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        resultText = findViewById(R.id.resultText)
    }


    fun mySum(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Error"
        } else {
            result = number1!! + number2!! // we are making sure there will be no null
            resultText.text = "Result : $result"
        }
    }

    fun mySub(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Error"
        } else {
            result = number1!! - number2!! // we are making sure there will be no null
            resultText.text = "Result : $result"
        }
    }

    fun myMultiply(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Error"
        } else {
            result = number1!! * number2!! // we are making sure there will be no null
            resultText.text = "Result : $result"
        }
    }

    fun myDiv(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Error"
        } else {
            val newResult = (number1!!).toDouble() / (number2!!).toDouble()

            resultText.text = "Result : " + "%.2f".format(newResult)
        }
    }

}