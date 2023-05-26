@file:Suppress("DEPRECATION")

package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LoginPage : AppCompatActivity() {
    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val backBtn = findViewById<FloatingActionButton>(R.id.backBtnLoginPg)

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

        backBtn.setOnClickListener {
            onBackPressed()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finishAffinity()
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(applicationContext, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }
}