package com.fani.mobile5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bilangan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bilangan)
        val numberInput = findViewById<EditText>(R.id.bil)
        val checkButton = findViewById<Button>(R.id.btn_cek)
        val resultText = findViewById<TextView>(R.id.Result)

        checkButton.setOnClickListener {
            val inputText = numberInput.text.toString()
            val number = inputText.toIntOrNull()

            if (number != null) {
                val result = if (number % 2 == 0) {
                    "$number adalah bilangan genap"
                } else {
                    "$number adalah bilangan ganjil"
                }
                resultText.text = result
            } else {
                resultText.text = "Input tidak valid. Masukkan bilangan bulat."
            }
        }
    }
}