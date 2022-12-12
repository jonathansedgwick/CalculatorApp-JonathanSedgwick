package com.example.calculator

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HistoryScreen : AppCompatActivity() {

    lateinit var historyBackButton: Button
    lateinit var historyCalcButton: Button
    lateinit var historyText: TextView
    lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_screen)

        historyBackButton = findViewById(R.id.history_back_button)
        historyCalcButton = findViewById(R.id.calc_screen_button)
        historyText = findViewById(R.id.history_text_view)
        clearButton = findViewById(R.id.clear_button)

        val SP = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val key1 = SP.getString("history", "")

        val editor: SharedPreferences.Editor = SP.edit()

        historyText.text = SP.getString("history", null)

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
        clearButton.setOnClickListener {
            editor.putString("history", "")
            editor.commit()
            historyText.text = SP.getString("history", null)
        }



    }





}