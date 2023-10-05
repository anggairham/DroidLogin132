package com.example.droidlogin132

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    private lateinit var txtLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtLogin = findViewById(R.id.txtLogin)
        txtLogin.setOnClickListener {
            val moveIntent = Intent(this@RegisterActivity,MainActivity::class.java)
            startActivity(moveIntent)
        }
    }
}