package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var simpleButton: Button
    lateinit var advancedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpleButton = findViewById(R.id.simple_button)
        advancedButton = findViewById(R.id.advanced_button)

        simpleButton.setOnClickListener{
            Intent(this@MainActivity, SimpleScreen::class.java).also {
                startActivity(it)
            }
        }

        advancedButton.setOnClickListener {
            Intent(this@MainActivity, AdvancedScreen::class.java).also {
                startActivity(it)
            }
        }

    }
}