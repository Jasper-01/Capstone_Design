package com.example.app

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity


class keywordPopup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyword_popup)

        val searchBtn = findViewById<ImageButton>(R.id.searchImageButton)

        searchBtn.setOnClickListener{
            val Intent = Intent(this, inputPopup::class.java)
            startActivity(Intent)
        }
    }
}