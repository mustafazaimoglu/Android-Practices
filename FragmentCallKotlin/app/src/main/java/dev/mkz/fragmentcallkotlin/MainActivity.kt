package dev.mkz.fragmentcallkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        acilisButton.setOnClickListener {
            callFragment(acilis())
        }

        birButton.setOnClickListener {
            callFragment(fr1())
        }

        ikiButton.setOnClickListener {
            callFragment(fr2())
        }

        ucButton.setOnClickListener {
            callFragment(fr3())
        }
    }

    fun callFragment(fragment : Fragment){
        val gecis = supportFragmentManager.beginTransaction()
        gecis.replace(R.id.fragmentContainerView,fragment)
        gecis.commit()
    }
}