package com.example.randomnumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateBtn = findViewById<Button>(R.id.btn_generate)
        val numberTv = findViewById<TextView>(R.id.number)

        generateBtn.setOnClickListener {
            val randomNumber : Int = (0..100).random()
            numberTv.text = randomNumber.toString()
        }
    }
}