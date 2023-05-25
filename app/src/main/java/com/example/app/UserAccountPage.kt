package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.imageview.ShapeableImageView

class UserAccountPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_account_page)

        val modifyBtn = findViewById<Button>(R.id.modifyBtn)
        val plannerBtn = findViewById<Button>(R.id.plannerBtnAccPg)
        val portfolioBtn = findViewById<Button>(R.id.portfolioBtnAccPg)

        val userImage = findViewById<ShapeableImageView>(R.id.userImage)

        userImage.setImageResource(R.drawable.ic_user_circle_foreground)

        plannerBtn.setOnClickListener{
            val intent = Intent(this, PlannerPage::class.java)
            startActivity(intent)
            finish()
        }

        portfolioBtn.setOnClickListener{
            val intent = Intent(this, PortfolioPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}