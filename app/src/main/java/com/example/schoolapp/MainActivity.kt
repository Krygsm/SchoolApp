package com.example.schoolapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : ComponentActivity() {
    private lateinit var txtScreen: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        txtScreen = findViewById(R.id.textView8)

        val buttons = arrayOf(
            findViewById<Button>(R.id.Zero),
            findViewById<Button>(R.id.One),
            findViewById<Button>(R.id.Two),
            findViewById<Button>(R.id.Three),
            findViewById<Button>(R.id.Four),
            findViewById<Button>(R.id.Five),
            findViewById<Button>(R.id.Six),
            findViewById<Button>(R.id.Seven),
            findViewById<Button>(R.id.Eight),
            findViewById<Button>(R.id.Nine),
            findViewById<Button>(R.id.Add),
            findViewById<Button>(R.id.Subdivide),
            findViewById<Button>(R.id.Multiply),
            findViewById<Button>(R.id.Divide),
            findViewById<Button>(R.id.Modulo)
        )

        for (button in buttons) {
            button.setOnClickListener {
                appendText(button.text.toString())
            }
        }

        findViewById<Button>(R.id.C).setOnClickListener {
            txtScreen.text = ""
        }

        findViewById<Button>(R.id.Equals).setOnClickListener {
            calculate()
        }
    }

    private fun appendText(text: String) {
        txtScreen.append(text)
    }

    private fun calculate() {
        val expressionString = txtScreen.text.toString()
        if (expressionString.contains("/0")) {
            txtScreen.text = "Undefined"
        } else {
            try {
                val expression = ExpressionBuilder(expressionString).build()
                val result = expression.evaluate()
                txtScreen.text = result.toString()
            } catch (e: Exception) {
                txtScreen.text = "Error"
            }
        }
    }
}