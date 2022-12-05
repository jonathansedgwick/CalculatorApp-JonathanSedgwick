package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HistoryScreen : AppCompatActivity() {

    lateinit var historyBackButton: Button
    lateinit var historyCalcButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_screen)

        historyBackButton = findViewById(R.id.history_back_button)
        historyCalcButton = findViewById(R.id.calc_screen_button)

        historyBackButton.setOnClickListener {
            Intent(this@HistoryScreen, MainActivity::class.java).also {
                startActivity(it)
            }
        }
        historyCalcButton.setOnClickListener {
            Intent(this@HistoryScreen, AdvancedScreen::class.java).also {
                startActivity(it)
            }
        }

    }
}