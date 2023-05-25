package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CreateAccountPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        val id = findViewById<EditText>(R.id.editCreateID)
        val pw = findViewById<EditText>(R.id.editCreatePassword)
        val email = findViewById<EditText>(R.id.editEmail)
        val phoneNum = findViewById<EditText>(R.id.editPhoneNum)

        // saving details locally
        val sharedPreferences = getSharedPreferences("accountDetails", MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val createAccountBtn = findViewById<Button>(R.id.confirmCreateAccountBtn)

        createAccountBtn.setOnClickListener {
            // need to save Account on cloud database
            if(id != null && pw != null && email != null && phoneNum != null){
                // get string from input field
                val inputID = id.text.toString()
                val inputPw = pw.text.toString()
                val inputEmail = email.text.toString()
                val inputPhoneNum = phoneNum.text.toString()

                // save details onto local device
                editor.putString("ID", inputID)
                editor.putString("Password", inputPw)
                editor.putString("Email", inputEmail)
                editor.putString("PhoneNumber", inputPhoneNum)
                editor.apply()

                val intent = Intent(this, SelectPage::class.java)
                startActivity(intent)
                finish()
            } else{
                Toast.makeText(applicationContext, "Please enter details for all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val intent = Intent(this, LoginPage::class.java)
        startActivity(intent)
        finish()
    }
}