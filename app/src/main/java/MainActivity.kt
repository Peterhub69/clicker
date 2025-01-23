package com.example.clickerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var increment = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterTextView: TextView = findViewById(R.id.counter)
        val incrementButton: Button = findViewById(R.id.increment_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        val toggleButton: Button = findViewById(R.id.toggle_button)

        incrementButton.setOnClickListener {
            counter = if (increment) counter + 1 else counter - 1
            counterTextView.text = counter.toString()
        }

        resetButton.setOnClickListener {
            counter = 0
            counterTextView.text = counter.toString()
        }

        toggleButton.setOnClickListener {
            increment = !increment
            toggleButton.text = if (increment) "Zmień na dekrementację" else "Zmień na inkrementację"
        }
    }
}
