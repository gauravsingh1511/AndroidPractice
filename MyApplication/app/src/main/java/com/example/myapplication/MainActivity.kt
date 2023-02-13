package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
           How to make Toast?
        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading...", Toast.LENGTH_SHORT).show()
        }

        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
        }*/

        /*
           How to enable Dark and Read mode?
        val btnDark = findViewById<Button>(R.id.btnDark)
        val btnReadMode = findViewById<Button>(R.id.btnReadMode)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        btnDark.setOnClickListener{
            // Change to Dark Mode
            layout.setBackgroundResource(R.color.black)
        }

        btnReadMode.setOnClickListener {
            // Change to Read Mode
            layout.setBackgroundResource(R.color.yellow)
        }*/



    }
}