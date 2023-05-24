package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateAccountPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        val createAccountBtn = findViewById<Button>(R.id.confirmCreateAccountBtn)

        createAccountBtn.setOnClickListener {
            // need to save Account on cloud database
            val intent = Intent(this, SelectPage::class.java)
            startActivity(intent)
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val intent = Intent(this, LoginPage::class.java)
        startActivity(intent)
        finish()
    }
}