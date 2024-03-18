package com.example.schoolapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
    }

    fun appendText(view: View) {
        val button = view as Button
        val buttonText = button.text.toString()

        val textView = findViewById<TextView>(R.id.textView8)
        var currentText = textView.text.toString()

        // Append the button text to the current text in the TextView
        currentText += buttonText
        textView.text = currentText
    }
}