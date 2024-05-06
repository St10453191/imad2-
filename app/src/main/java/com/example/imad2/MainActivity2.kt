package com.example.imad2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        private var hungrypet = 9
        private var cleanpet = 10
        private var playpet = 10



            val feedbutton = findViewById<Button>(R.id.button5)
            val playbutton = findViewById<Button>(R.id.button6)
            val cleanbutton = findViewById<Button>(R.id.button7)
            val message = findViewById<TextView>(R.id.textView8)
            val hunger = findViewById<TextView>(R.id.textView5)
            val clean = findViewById<TextView>(R.id.textView6)
            val happy = findViewById<TextView>(R.id.textView7)
            val image = findViewById<ImageView>(R.id.imageView3)
            //
            hunger.text = hungrypet.toString()
            clean.text = cleanpet.toString()
            happy.text = playpet.toString()

            if (cleanpet == 10)
                message.text = ("Simon is clean")
            image.setImageResource(R.drawable.bathe)

            playbutton.setOnClickListener {
                if ((playpet >= 10 )){
                    happy.text = playpet.toString()

                }
                playpet += 1
                cleanpet -= 2
                hungrypet -= 1
                hunger.text = hungrypet.toString()
                clean.text = cleanpet.toString()
                happy.text = playpet.toString()

                if (playpet == 10) {
                    message.text = "Simon is happy"
                    image.setImageResource(R.drawable.play)
                }
                if (hungrypet == 10) {
                    message.text = "Simon is full"
                    image.setImageResource(R.drawable.yams)
                }

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}