package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast

// main page before exiting (assume verification is done)
class SelectPage : AppCompatActivity() {
    private var doubleBackToExitPressedOnce = false

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
            val intent = Intent(this, PortfolioPage::class.java)
            startActivity(intent)
        }

        myPageBtn.setOnClickListener{
            val intent = Intent(this, UserAccountPage::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finishAffinity()
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(applicationContext, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }
}