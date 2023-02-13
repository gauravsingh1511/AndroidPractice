package com.example.multiscreendatashare

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        val textOrders = findViewById<TextView>(R.id.textOrders)
        textOrders.text = ordersOfCustomer.toString()
    }
}