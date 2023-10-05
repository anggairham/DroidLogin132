package com.example.droidlogin132

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtRegister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtRegister = findViewById(R.id.txtRegister)
        txtRegister.setOnClickListener {
            val moveIntent = Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(moveIntent)
        }
    }
}