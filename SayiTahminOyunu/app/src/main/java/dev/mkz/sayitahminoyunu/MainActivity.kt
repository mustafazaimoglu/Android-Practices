package dev.mkz.sayitahminoyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var randomizedNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getRandomizedNumber();
    }

    fun getRandomizedNumber() {
        randomizedNumber = Random.nextInt(100) + 1
        showNumberTextBox.text = randomizedNumber.toString()
        showNumberTextBox.visibility = View.INVISIBLE
        showRandomNumberButton.text = "Cevabı Göster"
    }

    fun getGuess(view: View) {
        var tempGuess = numberInputBox.text.toString().toIntOrNull()

        if (tempGuess == null) {
            messageBox.text = "Lütfen tahmininizi girin!!!"
        } else {
            if (tempGuess!! == randomizedNumber) {
                messageBox.text = "Tebrikler sayıyı buldunuz!"
            } else if (tempGuess!! > randomizedNumber) {
                messageBox.text = "Lütfen daha KÜÇÜK bir sayı deneyin!"
            } else {
                messageBox.text = "Lütfen daha BÜYÜK bir sayı deneyin!"
            }
        }
    }

    fun restartGame(view: View) {
        getRandomizedNumber()
        messageBox.text = ""
        numberInputBox.setText("")
    }

    fun showRandomizedNumber(view: View) {
        if (showNumberTextBox.isVisible) {
            showNumberTextBox.visibility = View.INVISIBLE
            showRandomNumberButton.text = "Cevabı Göster"
        } else {
            showNumberTextBox.visibility = View.VISIBLE
            showRandomNumberButton.text = "Cevabı Gizle"
        }
    }
}