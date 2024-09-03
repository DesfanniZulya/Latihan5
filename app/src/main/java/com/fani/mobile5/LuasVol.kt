package com.fani.mobile5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LuasVol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas_vol)
        val lengthInput = findViewById<EditText>(R.id.lengthInput)
        val widthInput = findViewById<EditText>(R.id.widthInput)
        val heightInput = findViewById<EditText>(R.id.heightInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val surfaceAreaResult = findViewById<TextView>(R.id.surfaceAreaResult)
        val volumeResult = findViewById<TextView>(R.id.volumeResult)

        calculateButton.setOnClickListener {
            val panjang = lengthInput.text.toString().toDoubleOrNull()
            val lebar = widthInput.text.toString().toDoubleOrNull()
            val tinggi = heightInput.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null && tinggi != null) {
                val surfaceArea = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
                val volume = panjang * lebar * tinggi
                surfaceAreaResult.text = String.format("Luas permukaan: %.2f", surfaceArea)
                volumeResult.text = String.format("Volume: %.2f", volume)
            } else {
                surfaceAreaResult.text = "Input tidak valid"
                volumeResult.text = ""
            }
        }
    }
}