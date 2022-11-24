package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SimpleScreen : AppCompatActivity() {

    lateinit var backButton: Button
    lateinit var numberText: TextView
    lateinit var oneButton: Button
    lateinit var twoButton: Button
    lateinit var threeButton: Button
    lateinit var fourButton: Button
    lateinit var fiveButton: Button
    lateinit var sixButton: Button
    lateinit var sevenButton: Button
    lateinit var eightButton: Button
    lateinit var nineButton: Button
    lateinit var zeroButton: Button
    lateinit var pointButton: Button
    lateinit var clearButton: Button
    lateinit var addButton: Button
    lateinit var equalsButton: Button
    lateinit var minusButton: Button
    lateinit var multiplyButton: Button
    lateinit var divideButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_screen)

        backButton = findViewById(R.id.simple_back_button)
        numberText = findViewById(R.id.number_text)
        oneButton = findViewById(R.id.one_button)
        twoButton = findViewById(R.id.two_button)
        threeButton = findViewById(R.id.three_button)
        fourButton = findViewById(R.id.four_button)
        fiveButton = findViewById(R.id.five_button)
        sixButton = findViewById(R.id.six_button)
        sevenButton = findViewById(R.id.seven_button)
        eightButton = findViewById(R.id.eight_button)
        nineButton = findViewById(R.id.nine_button)
        zeroButton = findViewById(R.id.zero_button)
        pointButton = findViewById(R.id.point_button)
        clearButton = findViewById(R.id.clear_button)
        addButton = findViewById(R.id.add_button)
        equalsButton = findViewById(R.id.equals_button)
        minusButton = findViewById(R.id.minus_button)
        multiplyButton = findViewById(R.id.multiply_button)
        divideButton = findViewById(R.id.divide_button)
        var firstNumber: Double = 0.0
        var secondNumber: Double = 0.0
        var functionNumber = 0

        backButton.setOnClickListener {
            Intent(this@SimpleScreen, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        oneButton.setOnClickListener {
            val newText = numberText.text.toString() + "1"
            numberText.text = newText
        }
        twoButton.setOnClickListener {
            val newText = numberText.text.toString() + "2"
            numberText.text = newText
        }
        threeButton.setOnClickListener {
            val newText = numberText.text.toString() + "3"
            numberText.text = newText
        }
        fourButton.setOnClickListener {
            val newText = numberText.text.toString() + "4"
            numberText.text = newText
        }
        fiveButton.setOnClickListener {
            val newText = numberText.text.toString() + "5"
            numberText.text = newText
        }
        sixButton.setOnClickListener {
            val newText = numberText.text.toString() + "6"
            numberText.text = newText
        }
        sevenButton.setOnClickListener {
            val newText = numberText.text.toString() + "7"
            numberText.text = newText
        }
        eightButton.setOnClickListener {
            val newText = numberText.text.toString() + "8"
            numberText.text = newText
        }
        nineButton.setOnClickListener {
            val newText = numberText.text.toString() + "9"
            numberText.text = newText
        }
        zeroButton.setOnClickListener {
            val newText = numberText.text.toString() + "0"
            numberText.text = newText
        }
        pointButton.setOnClickListener {
            if (numberText.text.indexOf(".") == -1) {
                val newText = numberText.text.toString() + "."
                numberText.text = newText
            }
        }
        clearButton.setOnClickListener {
            val newText = ""
            numberText.text = newText
        }
        addButton.setOnClickListener {
            if (numberText.text.toString() == "")
                firstNumber = 0.0
            else
            firstNumber = numberText.text.toString().toDouble()
            numberText.text = ""
            functionNumber = 1
        }
        minusButton.setOnClickListener {
            if (numberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = numberText.text.toString().toDouble()
            numberText.text = ""
            functionNumber = 2
        }
        multiplyButton.setOnClickListener {
            if (numberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = numberText.text.toString().toDouble()
            numberText.text = ""
            functionNumber = 3
        }
        divideButton.setOnClickListener {
            if (numberText.text.toString() == "")
                firstNumber = 0.0
            else
                firstNumber = numberText.text.toString().toDouble()
            numberText.text = ""
            functionNumber = 4
        }
        equalsButton.setOnClickListener {
            if(functionNumber == 1) {
                if (numberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = numberText.text.toString().toDouble()
                numberText.text = (firstNumber + secondNumber).toString()
                functionNumber = 0
            }
            if(functionNumber == 2) {
                if (numberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = numberText.text.toString().toDouble()
                numberText.text = (firstNumber - secondNumber).toString()
                functionNumber = 0
            }
            if(functionNumber == 3) {
                if (numberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = numberText.text.toString().toDouble()
                numberText.text = (firstNumber * secondNumber).toString()
                functionNumber = 0
            }
            if(functionNumber == 4) {
                if (numberText.text.toString() == "")
                    secondNumber = 0.0
                else
                    secondNumber = numberText.text.toString().toDouble()
                numberText.text = (firstNumber / secondNumber).toString()
                functionNumber = 0
            }

        }


    }
}