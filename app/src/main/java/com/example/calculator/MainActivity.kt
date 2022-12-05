package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var advancedButton: Button
    lateinit var historyButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        advancedButton = findViewById(R.id.advanced_button)
        historyButton = findViewById(R.id.history_button)


        advancedButton.setOnClickListener {
            Intent(this@MainActivity, AdvancedScreen::class.java).also {
                startActivity(it)
            }
        }
        historyButton.setOnClickListener {
            Intent(this@MainActivity, HistoryScreen::class.java).also {
                startActivity(it)
            }
        }

    }
}