package com.example.multiscreendatashare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Creating KEY

    companion object {
        const val KEY = "com.example.multiscreendatashare.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrderNow = findViewById<Button>(R.id.btnOrderNow)
        val eT1 = findViewById<TextView>(R.id.eT1)
        val eT2 = findViewById<TextView>(R.id.eT2)
        val eT3 = findViewById<TextView>(R.id.eT3)
        val eT4 = findViewById<TextView>(R.id.eT4)

        btnOrderNow.setOnClickListener {
            val ordersPlaced = eT1.text.toString() + " " + eT2.text.toString() + " " +
                    eT3.text.toString() + " " + eT4.text.toString()

            intent = Intent(this, OrderActivity::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }
    }
}