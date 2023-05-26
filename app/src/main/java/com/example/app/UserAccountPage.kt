@file:Suppress("DEPRECATION")

package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.imageview.ShapeableImageView

class UserAccountPage : AppCompatActivity() {
    private val inputFieldsID = intArrayOf(
        R.id.editIDUserPg, R.id.editPasswordUserPg, R.id.editEmailUserPg, R.id.editPhoneNumUserPg
    )

    private val inputFieldsName = arrayListOf<String>(
        "ID", "Password", "Email", "PhoneNum"
    )

    private var inputFields = arrayOfNulls<EditText>(inputFieldsID.size)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_account_page)

        val backBtn = findViewById<FloatingActionButton>(R.id.backBtnUserAccPg)

        val modifyBtn = findViewById<Button>(R.id.modifyBtn)
        val plannerBtn = findViewById<Button>(R.id.plannerBtnAccPg)
        val portfolioBtn = findViewById<Button>(R.id.portfolioBtnAccPg)

        val userImage = findViewById<ShapeableImageView>(R.id.userImage)

        userImage.setImageResource(R.drawable.ic_user_circle_foreground)

        for(i in inputFieldsID.indices){
            inputFields[i] = findViewById(inputFieldsID[i])
            editText.disableEditText(inputFields[i])
        }

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

        modifyBtn.setOnClickListener {
            for(i in inputFieldsID.indices){
                inputFields[i] = findViewById(inputFieldsID[i])
                editText.enableEditText(inputFields[i])
            }
        }

        backBtn.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}