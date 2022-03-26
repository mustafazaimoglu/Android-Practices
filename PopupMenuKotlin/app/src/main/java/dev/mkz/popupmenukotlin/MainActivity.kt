package dev.mkz.popupmenukotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val popup = PopupMenu(applicationContext, button)
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)
            popup.setOnMenuItemClickListener { i ->
                when (i.itemId) {
                    R.id.sil -> {
                        Toast.makeText(applicationContext, "Silindi", Toast.LENGTH_SHORT).show()
                    }
                    R.id.duzenle -> {
                        Toast.makeText(applicationContext, "Duzenlendi", Toast.LENGTH_SHORT).show()
                    }
                    R.id.vazgec -> {
                        Toast.makeText(applicationContext, "Vazgecildi", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
            popup.show()
        }
    }
}