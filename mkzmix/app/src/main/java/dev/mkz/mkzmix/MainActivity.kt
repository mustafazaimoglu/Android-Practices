package dev.mkz.mkzmix

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

const val path = "dev.mkz.mkzmix"
const val key = "name"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentGelenYazi = intent.getStringExtra("battousai")
        textView4.text = intentGelenYazi
        val preferences = getSharedPreferences(path, Context.MODE_PRIVATE)
        val editor = preferences.edit()

        toggleButton2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                callFragment(testfr2())
            }
            else {
                callFragment(testfr1())
            }
        }

        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textView4.text = "Minho"
            }
            else {
                textView4.text = "MKZ"
            }
        }

        show.setOnClickListener {
            Toast.makeText(applicationContext, preferences.getString(key,"NULL"), Toast.LENGTH_SHORT).show()
        }

        save.setOnClickListener {
            editor.putString(key,textBox.text.toString())
            editor.apply()

            textView4.text = "saved"
        }

        remove.setOnClickListener {
            editor.remove(key)
            editor.apply()

            textView4.text = "removed"
        }
    }

    fun callFragment(fragment: Fragment){
        val gecis = supportFragmentManager.beginTransaction()
        gecis.replace(R.id.fragmentContainerView2,fragment)
        gecis.commit()
    }
}