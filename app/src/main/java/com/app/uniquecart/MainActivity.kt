package com.app.uniquecart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.gotoMain)
        btn.setOnClickListener {
            startActivity(Intent(this, R.layout.activity_dashboard_screen::class.java))
        }
    }
}