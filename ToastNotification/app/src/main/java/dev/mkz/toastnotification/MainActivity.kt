package dev.mkz.toastnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toasterButton.setOnClickListener {
            Toast.makeText(applicationContext,"Bu bir Toast mesajıdır.",Toast.LENGTH_LONG).show()
        }

        toasterButton2.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.toast_tasarim,null)
            var tn = Toast(applicationContext)
            tn.view = tasarim
            tn.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            tn.duration = Toast.LENGTH_SHORT
            tn.show()
        }
    }
}