package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserAccountPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_account_page)

        val modifyBtn = findViewById<Button>(R.id.modifyBtn)
        val plannerBtn = findViewById<Button>(R.id.plannerBtnAccPg)
        val portfolioBtn = findViewById<Button>(R.id.portfolioBtnAccPg)
    }
}