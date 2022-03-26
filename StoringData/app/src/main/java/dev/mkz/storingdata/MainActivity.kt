package dev.mkz.storingdata

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences : SharedPreferences
    var ageFromPreferences: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Shared Preferences Initialized
        sharedPreferences = this.getSharedPreferences("dev.mkz.storingdata", Context.MODE_PRIVATE)

        ageFromPreferences = sharedPreferences.getInt("age",-1)

        if (ageFromPreferences == -1)
        {
            textView.text = "Your Age : "
        }
        else {
            textView.text = "Your Age : $ageFromPreferences"
        }
    }

    fun save(view: View) {

        // Shared Preferences

        var myAge = editTextNumber.text.toString().toIntOrNull()

        if (myAge != null) {
            textView.text = "Your Age : " + myAge.toString()
            sharedPreferences.edit().putInt("age", myAge).apply()
        }

    }

    fun delete(view: View) {
        sharedPreferences = this.getSharedPreferences("dev.mkz.storingdata", Context.MODE_PRIVATE)

        if(ageFromPreferences != -1)
        {
            sharedPreferences.edit().remove("age").apply()
            textView.text = "Your Age : "
        }
    }
}