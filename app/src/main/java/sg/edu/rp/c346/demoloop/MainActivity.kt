package sg.edu.rp.c346.demoloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {

            var i = 1
            while (i < 6){
                Log.d("MainActivity", "$i")
                i++
            }
        }

        button2.setOnClickListener {
            val word = editText.text.toString()

            for (letter in word){
                Log.d("MainActivty", "$letter")
            }
        }
    }
}
