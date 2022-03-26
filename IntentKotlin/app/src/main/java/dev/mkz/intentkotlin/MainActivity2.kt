package dev.mkz.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val gelenyazi = intent.getStringExtra("yazi")

        if (!gelenyazi.isNullOrEmpty())
        {
            secondTextView.text = gelenyazi
        }
        else
        {
            secondTextView.text = "Second Activity"
        }

        goFirst.setOnClickListener {
            val gecis2 = Intent(applicationContext,MainActivity::class.java)

            startActivity(gecis2)
        }
    }
}