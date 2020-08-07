package com.example.demo_03_activity2activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nxtbutton = findViewById<Button>(R.id.nxtButton)

        nxtbutton.setOnClickListener {
            val indent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}