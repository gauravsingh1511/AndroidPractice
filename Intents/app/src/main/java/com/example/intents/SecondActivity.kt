package com.example.intents

import android.content.ComponentName
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_acitivity)

        val cardGitHub = findViewById<CardView>(R.id.cardGitHub)
        val cardCamera = findViewById<CardView>(R.id.cardCamera)
        val cardMessage = findViewById<CardView>(R.id.cardMessage)
        val cardMusic = findViewById<CardView>(R.id.cardMusic)
        val cardCall = findViewById<CardView>(R.id.cardCall)

        cardGitHub.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/gauravsingh1511")
            startActivity(intent)
        }

        cardCamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        cardMessage.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hey I'm Gaurav Singh")
            intent.type = "text/plain"
            startActivity(intent)
        }

        cardMusic.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }

        //checkPermission()
        cardCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "7503562683")
            startActivity(intent)
        }

    }

    /*private fun checkPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                101
            )
        }
    }*/
}