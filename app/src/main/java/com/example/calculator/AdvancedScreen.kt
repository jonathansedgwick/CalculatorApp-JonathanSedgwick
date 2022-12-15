package com.example.calculator

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow

class AdvancedScreen : AppCompatActivity() {

    lateinit var AbackButton: Button
    lateinit var AnumberText: TextView
    lateinit var AoneButton: Button
    lateinit var AtwoButton: Button
    lateinit var AthreeButton: Button
    lateinit var AfourButton: Button
    lateinit var AfiveButton: Button
    lateinit var AsixButton: Button
    lateinit var AsevenButton: Button
    lateinit var AeightButton: Button
    lateinit var AnineButton: Button
    lateinit var AzeroButton: Button
    lateinit var ApointButton: Button
    lateinit var AclearButton: Button
    lateinit var AaddButton: Button
    lateinit var AequalsButton: Button
    lateinit var AminusButton: Button
    lateinit var AmultiplyButton: Button
    lateinit var AdivideButton: Button
    lateinit var AplusMinusButton: Button
    lateinit var exponentButton: Button
    lateinit var historyScreenButton: Button
    lateinit var factorialButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_screen)

        AbackButton = findViewById(R.id.advanced_back_button)
        AnumberText = findViewById(R.id.advanced_number_text)
        AoneButton = findViewById(R.id.advanced_one_button)
        AtwoButton = findViewById(R.id.advanced_two_button)
        AthreeButton = findViewById(R.id.advanced_three_button)
        AfourButton = findViewById(R.id.advanced_four_button)
        AfiveButton = findViewById(R.id.advanced_five_button)
        AsixButton = findViewById(R.id.advanced_six_button)
        AsevenButton = findViewById(R.id.advanced_seven_button)
        AeightButton = findViewById(R.id.advanced_eight_button)
        AnineButton = findViewById(R.id.advanced_nine_button)
        AzeroButton = findViewById(R.id.advanced_zero_button)
        ApointButton = findViewById(R.id.advanced_point_button)
        AclearButton = findViewById(R.id.advanced_clear_button)
        AaddButton = findViewById(R.id.advanced_add_button)
        AequalsButton = findViewById(R.id.advanced_equals_button)
        AminusButton = findViewById(R.id.advanced_minus_button)
        AmultiplyButton = findViewById(R.id.advanced_multiply_button)
        AdivideButton = findViewById(R.id.advanced_divide_button)
        AplusMinusButton = findViewById(R.id.advanced_plus_minus_button)
        exponentButton = findViewById(R.id.exponent_button)
        historyScreenButton = findViewById(R.id.history_screen_button)
        factorialButton = findViewById(R.id.factorial_button)
        var firstNumber: Double = 0.0
        var secondNumber: Double = 0.0
        var functionNumber = 0
        var equation: String = ""

        val SP = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        val key1 = SP.getString("history", "")

        val editor: SharedPreferences.Editor = SP.edit()
        var history = SP.getString("history", "")

        AbackButton.setOnClickListener {
            Intent(this@AdvancedScreen, MainActivity::class.java).also {
                startActivity(it)
            }
        }
        historyScreenButton.setOnClickListener {
            Intent(this@AdvancedScreen, HistoryScreen::class.java).also {
                it.putExtra("EQUATION", equation)

                editor.putString("history" , history + equation)
                editor.apply()
                startActivity(it)
            }

        }

        AoneButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "1"
            AnumberText.text = newText
        }
        AtwoButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "2"
            AnumberText.text = newText
        }
        AthreeButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "3"
            AnumberText.text = newText
        }
        AfourButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "4"
            AnumberText.text = newText
        }
        AfiveButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "5"
            AnumberText.text = newText
        }
        AsixButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "6"
            AnumberText.text = newText
        }
        AsevenButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "7"
            AnumberText.text = newText
        }
        AeightButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "8"
            AnumberText.text = newText
        }
        AnineButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "9"
            AnumberText.text = newText
        }
        AzeroButton.setOnClickListener {
            val newText = AnumberText.text.toString() + "0"
            AnumberText.text = newText
        }
        ApointButton.setOnClickListener {
            if (AnumberText.text.indexOf(".") == -1) {
                val newText = AnumberText.text.toString() + "."
                AnumberText.text = newText
            }
        }
        AclearButton.setOnClickListener {
            val newText = ""
            AnumberText.text = newText
        }
        AaddButton.setOnClickListener {
            if (AnumberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = AnumberText.text.toString().toDouble()
            AnumberText.text = ""
            functionNumber = 1
        }
        AminusButton.setOnClickListener {
            if (AnumberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = AnumberText.text.toString().toDouble()
            AnumberText.text = ""
            functionNumber = 2
        }
        AmultiplyButton.setOnClickListener {
            if (AnumberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = AnumberText.text.toString().toDouble()
            AnumberText.text = ""
            functionNumber = 3
        }
        AdivideButton.setOnClickListener {
            if (AnumberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = AnumberText.text.toString().toDouble()
            AnumberText.text = ""
            functionNumber = 4
        }
        exponentButton.setOnClickListener {
            if (AnumberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = AnumberText.text.toString().toDouble()
            AnumberText.text = ""
            functionNumber = 5
        }
//        factorialButton.setOnClickListener {
//            if (AnumberText.text.toString() == "")
//                firstNumber = 0.0
//            else
//                firstNumber = AnumberText.text.toString().toDouble()
//            AnumberText.text = ""
//            functionNumber = 6
//        }
        AplusMinusButton.setOnClickListener {
            if (AnumberText.text.indexOf("-") == -1) {
                var newText = "-" + AnumberText.text
                AnumberText.text = newText
            }
            else
                AnumberText.text = AnumberText.text.substring(1)

        }
        AequalsButton.setOnClickListener {
            if(functionNumber == 1) {
                if (AnumberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = AnumberText.text.toString().toDouble()
                var result = (firstNumber + secondNumber).toString()
                AnumberText.text = format(result)
                functionNumber = 0
                equation += "${format(firstNumber.toString())} + ${format(secondNumber.toString())} = ${format(result)}\n"

            }
            if(functionNumber == 2) {
                if (AnumberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = AnumberText.text.toString().toDouble()
                var result = (firstNumber - secondNumber).toString()
                AnumberText.text = format(result)
                functionNumber = 0
                equation += "${format(firstNumber.toString())} - ${format(secondNumber.toString())} = ${format(result)}\n"


            }
            if(functionNumber == 3) {
                if (AnumberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = AnumberText.text.toString().toDouble()
                var result = (firstNumber * secondNumber).toString()
                AnumberText.text = format(result)
                functionNumber = 0
                equation += "${format(firstNumber.toString())} x ${format(secondNumber.toString())} = ${format(result)}\n"


            }
            if(functionNumber == 4) {
                if (AnumberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = AnumberText.text.toString().toDouble()
                var result = (firstNumber / secondNumber).toString()
                AnumberText.text = format(result)
                functionNumber = 0
                equation += "${format(firstNumber.toString())} ÷ ${format(secondNumber.toString())} = ${format(result)}\n"


            }
            if(functionNumber == 5) {
                if (AnumberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = AnumberText.text.toString().toDouble()
                var result = (firstNumber.pow(secondNumber)).toString()
                AnumberText.text = format(result)
                functionNumber = 0
                equation += "${format(firstNumber.toString())} ^ ${format(secondNumber.toString())} = ${format(result)}\n"

            }
//            if(functionNumber == 6){
//                if (AnumberText.text.toString() == "")
//                    secondNumber = 0.0
//                else
//                    secondNumber = AnumberText.text.toString().toDouble()
//
//
//
//                AnumberText.text = format(result)
//                functionNumber = 0
//                equation += "${format(firstNumber.toString())} ^ ${format(secondNumber.toString())} = ${format(result)}\n"
//
//            }

        }


    }

    private fun format(a: String): String {
        if(a.substring(a.length-2) == ".0")
            return a.substring(0,a.length-2)
        else
            return a
    }


}