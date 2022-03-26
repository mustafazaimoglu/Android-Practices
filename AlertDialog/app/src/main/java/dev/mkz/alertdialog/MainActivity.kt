package dev.mkz.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alertTrigger.setOnClickListener { obj ->
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("This is an alert Message!")
                .setTitle("Alert")
                .setPositiveButton("Yes") { _, _ ->
                    Toast.makeText(this, "Toaster MKZ", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("No") { _, _ ->
                    Snackbar.make(obj, "SnackBar MKZ", Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }

        alertTrigger2.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim, null)
            val editAlert = tasarim.findViewById(R.id.isim) as EditText
            val ad = AlertDialog.Builder(this)
                .setMessage("İsim Giriniz:")
                .setTitle("Uyari!")
                .setIcon(android.R.drawable.presence_audio_online)
                .setView(tasarim)
                .setPositiveButton("Yeap!") { _, _ ->
                    var mkz = editAlert.text.toString()
                    Toast.makeText(this,mkz,Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}