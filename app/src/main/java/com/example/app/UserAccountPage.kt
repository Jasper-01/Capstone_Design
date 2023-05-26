@file:Suppress("DEPRECATION")

package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.imageview.ShapeableImageView

class UserAccountPage : AppCompatActivity() {
    private val inputFieldsID = intArrayOf(
        R.id.editIDUserPg, R.id.editPasswordUserPg, R.id.editEmailUserPg, R.id.editPhoneNumUserPg
    )

    private val underlineID = intArrayOf(
        R.id.underlineID, R.id.underlinePassword, R.id.underlineEmail, R.id.underlinePhoneNum
    )

    private val inputFieldsName = arrayListOf<String>(
        "ID", "Password", "Email", "PhoneNum"
    )

    private var inputFields = arrayOfNulls<EditText>(inputFieldsID.size)

    private var underlineFields = arrayOfNulls<View>(underlineID.size)

    var modify = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_account_page)

        val backBtn = findViewById<FloatingActionButton>(R.id.backBtnUserAccPg)

        val modifyBtn = findViewById<Button>(R.id.modifyBtn)
        val plannerBtn = findViewById<Button>(R.id.plannerBtnAccPg)
        val portfolioBtn = findViewById<Button>(R.id.portfolioBtnAccPg)

        val userImage = findViewById<ShapeableImageView>(R.id.userImage)

        userImage.setImageResource(R.drawable.ic_user_circle_foreground)

        modifyDisable(modifyBtn)

        plannerBtn.setOnClickListener {
            val intent = Intent(this, PlannerPage::class.java)
            startActivity(intent)
            finish()
        }

        portfolioBtn.setOnClickListener {
            val intent = Intent(this, PortfolioPage::class.java)
            startActivity(intent)
            finish()
        }

        modifyBtn.setOnClickListener {
            if (!modify) modifyEnable(modifyBtn)
            else modifyDisable(modifyBtn)
        }

        backBtn.setOnClickListener {
            onBackPressed()
        }
    }

    fun modifyEnable(modifyBtn : Button){
        for (i in inputFieldsID.indices) {
            inputFields[i] = findViewById(inputFieldsID[i])
            editText.enableEditText(inputFields[i])
            modifyBtn.text = getString(R.string.confirm)

            underlineFields[i] = findViewById(underlineID[i])
            underlineFields[i]?.visibility = View.VISIBLE

            modify = true
        }
    }

    fun modifyDisable(modifyBtn : Button){
        for (i in inputFieldsID.indices) {
            inputFields[i] = findViewById(inputFieldsID[i])
            editText.disableEditText(inputFields[i])
            modifyBtn.text = getString(R.string.modify)

            underlineFields[i] = findViewById(underlineID[i])
            underlineFields[i]?.visibility = View.INVISIBLE

            modify = false
        }
    }
}