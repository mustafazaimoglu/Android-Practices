package dev.mkz.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        // getIntent

        val intent = intent
        var username = intent.getStringExtra("username")
        var name = intent.getStringExtra("name")

        usernameTextNextActivity.text = "Username : " + username
        nameTextNextActivity.text = "Name : " + name
    }
}