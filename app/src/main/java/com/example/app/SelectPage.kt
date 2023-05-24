package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_page)

        val plannerBtn = findViewById<Button>(R.id.goToPlannerBtn)
        val portfolioBtn = findViewById<Button>(R.id.goToPortfolioBtn)
        val myPageBtn = findViewById<Button>(R.id.goToMyPage)

        plannerBtn.setOnClickListener{
            val intent = Intent(this, PlannerPage::class.java)
            startActivity(intent)
        }

        portfolioBtn.setOnClickListener{
            val intent = Intent(this, Case1PortfolioPage::class.java)
            startActivity(intent)
        }

        myPageBtn.setOnClickListener{
            val intent = Intent(this, UserAccountPage::class.java)
            startActivity(intent)
        }
    }
}