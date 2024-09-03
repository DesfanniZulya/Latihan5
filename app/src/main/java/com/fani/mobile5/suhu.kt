package com.fani.mobile5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class suhu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suhu)
        val edtCelsius = findViewById<EditText>(R.id.input_celsius)
        val btnKonversi = findViewById<Button>(R.id.btn_konversi)
        val tvFahrenheit = findViewById<TextView>(R.id.input_fahrenheit)
        val tvKelvin = findViewById<TextView>(R.id.input_kelvin)
        val tvReamur = findViewById<TextView>(R.id.input_reamur)

        btnKonversi.setOnClickListener {
            val celsius = edtCelsius.text.toString().toDouble()
            val fahrenheit = (9 / 5.0) * celsius + 32
            val kelvin = celsius + 273.15
            val reamur = (4 / 5.0) * celsius

            tvFahrenheit.text = "Fahrenheit: $fahrenheit"
            tvKelvin.text = "Kelvin: $kelvin"
            tvReamur.text = "Reamur: $reamur"
        }
    }
}