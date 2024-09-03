package com.fani.mobile5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Belanja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_belanja)
        val totalAmountInput = findViewById<EditText>(R.id.totalAmountInput)
        val calculateDiscountButton = findViewById<Button>(R.id.calculateDiscountButton)
        val discountResult = findViewById<TextView>(R.id.discountResult)

        calculateDiscountButton.setOnClickListener {
            val totalAmount = totalAmountInput.text.toString().toDoubleOrNull()
            if (totalAmount != null) {
                val discount = when {
                    totalAmount < 100000 -> 0.0
                    totalAmount <= 500000 -> 0.10
                    totalAmount <= 1000000 -> 0.20
                    else -> 0.30
                }
                val discountedAmount = totalAmount * discount
                discountResult.text = String.format("Diskon: Rp %.2f", discountedAmount)
            } else {
                discountResult.text = "Input tidak valid"
            }
        }
    }
}