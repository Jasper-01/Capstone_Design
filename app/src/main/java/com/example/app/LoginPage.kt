package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val createAccountBtn = findViewById<Button>(R.id.createAccountBtn)

        loginBtn.setOnClickListener{
            // need to verify login
            val intent = Intent(this, SelectPage::class.java)
            startActivity(intent)
            finish()
        }

        createAccountBtn.setOnClickListener{
            val intent = Intent(this, CreateAccountPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}