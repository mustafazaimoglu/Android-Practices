package dev.mkz.progressandfloatingbarex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startstop.setOnClickListener {
            if (progressBar.visibility == View.VISIBLE) {
                progressBar.visibility = View.INVISIBLE
            } else {
                progressBar.visibility = View.VISIBLE
            }
        }

        floatingActionButton.setOnClickListener {
            val ad = AlertDialog.Builder(this)
            ad.setTitle("FLOATING BUTTON DOG")
            ad.setMessage("FLOATIN BUTTON CLICKED")
            ad.show()
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textView.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        getRating.setOnClickListener {
            textView2.text = ratingBar.rating.toString()
        }
    }
}