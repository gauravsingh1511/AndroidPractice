package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplicit = findViewById<Button>(R.id.btnClick)

        btnExplicit.setOnClickListener {
            // Open A new Activity
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}