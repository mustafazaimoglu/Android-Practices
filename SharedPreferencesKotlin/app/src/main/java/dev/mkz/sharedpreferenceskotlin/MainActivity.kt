package dev.mkz.sharedpreferenceskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

const val file_path = "dev.mkz.sharedpreferenceskotlin"
const val key_name = "name"
const val key_age = "age"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate Çağırıldı")

        val preferences = getSharedPreferences(file_path, Context.MODE_PRIVATE)
        val editor = preferences.edit()

        Toast.makeText(
            applicationContext, "Name : ${preferences.getString(key_name, "No Entry")}\n" +
                    "Age : ${preferences.getInt(key_age, 0)}", Toast.LENGTH_LONG
        ).show()

        save.setOnClickListener { obj ->
            editor
                .putString(key_name, nameBox.text.toString())
                .putInt(key_age, ageBox.text.toString().toInt())
                .apply()
            Snackbar.make(obj, "Saved Successfully", Snackbar.LENGTH_LONG).show()
        }

        delete.setOnClickListener { obj ->
            editor
                .remove(key_name)
                .remove(key_age)
                .apply()
            Snackbar.make(obj, "Saved Successfully", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart Çağırıldı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart Çağırıldı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Çağırıldı")
    }

    override fun onPause() {
        super.onPause()
        println("onPause Çağırıldı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume Çağırıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Çağırıldı")
    }
}