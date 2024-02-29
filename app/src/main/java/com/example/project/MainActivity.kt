package com.example.project


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        val buttonClickMe = findViewById<Button>(R.id.buttonClickMe)
        val textViewClickCount = findViewById<TextView>(R.id.textViewClickCount)

        buttonClickMe.setOnClickListener {
            clickCount++
            textViewClickCount.text = "Clicks: $clickCount"
        }
    }
}
