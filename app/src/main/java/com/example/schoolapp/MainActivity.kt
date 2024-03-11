package com.example.schoolapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val textView: TextView = findViewById(R.id.textView)

        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button.setOnClickListener {
            textView.text = "11"
        }
        button2.setOnClickListener {
            textView.text = "2"
        }
        button3.setOnClickListener {
            textView.text = "3"
        }
    }
}
