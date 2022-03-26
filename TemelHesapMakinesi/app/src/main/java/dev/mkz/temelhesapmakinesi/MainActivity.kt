package dev.mkz.temelhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var firstNumber: String = ""
    var secondNumber: String = ""
    var operator: String = ""
    var firstNumberExists = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getValueOfNumberButton(view: View) {
        var instantButton = view as Button
        var displayValue = userInterfaceDisplay.text.toString()
        var tempValue: String = ""

        when (instantButton.id) {
            R.id.sayi0 -> {
                tempValue += "0"
            }
            sayi1.id -> {
                tempValue += "1"
            }
            sayi2.id -> {
                tempValue += "2"
            }
            sayi3.id -> {
                tempValue += "3"
            }
            sayi4.id -> {
                tempValue += "4"
            }
            sayi5.id -> {
                tempValue += "5"
            }
            sayi6.id -> {
                tempValue += "6"
            }
            sayi7.id -> {
                tempValue += "7"
            }
            sayi8.id -> {
                tempValue += "8"
            }
            sayi9.id -> {
                tempValue += "9"
            }
            nokta.id -> {
                tempValue += "."
            }
        }

        if (firstNumberExists) {
            secondNumber += tempValue
        }

        userInterfaceDisplay.text = displayValue + tempValue
    }

    fun getValueOfOperatorButton(view: View) {
        var instantButton = view as Button
        var displayValue = userInterfaceDisplay.text.toString()

        if (displayValue != "") {
            if (!(displayValue.contains("*") || displayValue.contains("+")
                        || displayValue.contains("/") || displayValue.contains("-"))
                || displayValue[0] == '-'
            ) {
                if (firstNumber == "") {
                    firstNumber = displayValue
                    firstNumberExists = true
                }

                when (instantButton.id) {
                    arti.id -> {
                        displayValue += "+"
                        operator = "+"
                    }
                    carpi.id -> {
                        displayValue += "*"
                        operator = "*"
                    }
                    eksi.id -> {
                        displayValue += "-"
                        operator = "-"
                    }
                    bolu.id -> {
                        displayValue += "/"
                        operator = "/"
                    }
                }

            }
        }
        userInterfaceDisplay.text = displayValue

    }

    fun calculateResult(view: View) {
        var result: Double = 0.0
        var firstNumberValue = firstNumber.toDoubleOrNull()
        var secondNumberValue = secondNumber.toDoubleOrNull()

        println(firstNumberValue)
        println(secondNumberValue)

        if (!(secondNumberValue == null || firstNumberValue == null || operator == null)) {
            when (operator) {
                "+" -> {
                    result = firstNumberValue + secondNumberValue
                }
                "-" -> {
                    result = firstNumberValue - secondNumberValue
                }
                "*" -> {
                    result = firstNumberValue * secondNumberValue
                }
                "/" -> {
                    result = firstNumberValue / secondNumberValue
                }
            }


            userInterfaceDisplay.text = result.toString()
            firstNumber = result.toString()
            secondNumber = ""
        } else {
            userInterfaceDisplay.text = "Error"
        }
    }

    fun clearAll(view: View) {
        userInterfaceDisplay.text = ""
        firstNumber = ""
        firstNumberExists = false
        secondNumber = ""
        operator = ""
    }
}