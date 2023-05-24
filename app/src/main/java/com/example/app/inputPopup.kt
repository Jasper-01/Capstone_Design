
package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class inputPopup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_popup)

        val applyBtn = findViewById<Button>(R.id.applyBtn)
        val cancelBtn = findViewById<Button>(R.id.cancelBtn)
    }
}