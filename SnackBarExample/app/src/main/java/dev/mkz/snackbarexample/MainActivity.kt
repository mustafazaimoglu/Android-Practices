package dev.mkz.snackbarexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trigger.setOnClickListener { obj ->
            val sb = Snackbar.make(obj,"Snackbar Example",Snackbar.LENGTH_LONG)
            sb.setAction("Continue"){
                Toast.makeText(this,"MKZ",Toast.LENGTH_SHORT).show()
            }
            sb.setActionTextColor(Color.YELLOW)
            sb.setTextColor(Color.BLACK)
            sb.setBackgroundTint(Color.MAGENTA)
            sb.show()
        }
    }
}