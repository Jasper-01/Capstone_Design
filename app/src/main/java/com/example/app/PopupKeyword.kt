package com.example.app

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class PopupKeyword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyword_popup)

        val searchBtn = findViewById<ImageButton>(R.id.searchImageButton)

        searchBtn.setOnClickListener{

        }
    }
}