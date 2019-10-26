package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }

    }


    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt2.toString()

        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText3.text = randomInt3.toString()
    }
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        //For resultText 1
        if (resultText.text == "Hello World!" ) {
            resultText.text = "1"
        } else {

            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }

        //For resultText 2
        if (resultText2.text == "Hello World!" ) {
            resultText2.text = "1"
        } else {

            var resultInt2 = resultText2.text.toString().toInt()

            if (resultInt2 < 6) {
                resultInt2++
                resultText2.text = resultInt2.toString()
            }
        }

        //For resultText 3
        if (resultText3.text == "Hello World!" ) {
            resultText3.text = "1"
        } else {

            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt3 < 6) {
                resultInt3++
                resultText3.text = resultInt3.toString()
            }
        }
    }
}