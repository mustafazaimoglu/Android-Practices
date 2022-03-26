package dev.mkz.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        goSecond.setOnClickListener {
            val gecis1 = Intent(applicationContext,MainActivity2::class.java)
            gecis1.putExtra("yazi",yazi.text.toString())
            startActivity(gecis1)
//            finish()
        }
    }
}