package com.example.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity


class PlannerPage : AppCompatActivity() {
    private val buttonIDs = intArrayOf(
        R.id.button00, R.id.button01, R.id.button02, R.id.button03, R.id.button04,
        R.id.button10, R.id.button11, R.id.button12, R.id.button13, R.id.button14,
        R.id.button20, R.id.button21, R.id.button22, R.id.button23, R.id.button24,
        R.id.button30, R.id.button31, R.id.button32, R.id.button33, R.id.button34,
        R.id.button40, R.id.button41, R.id.button42, R.id.button43, R.id.button44,
    )

    private var buttons = arrayOfNulls<Button>(buttonIDs.size)

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planner_page)

        val searchBtn = findViewById<LinearLayout>(R.id.searchBar)

        for (i in buttonIDs.indices){
            buttons[i] = findViewById(buttonIDs[i])
            buttons[i]?.setOnClickListener{
                val view = layoutInflater.inflate(R.layout.activity_popup_input, null)
                val window = PopupWindow(this)
                window.contentView = view
                window.showAtLocation(view, Gravity.CENTER, 0, 0)

                val cancelBtn = view.findViewById<Button>(R.id.cancelBtn)
                val applyBtn = view.findViewById<Button>(R.id.applyBtn)

                cancelBtn.setOnClickListener {
                    window.dismiss()
                }

                applyBtn.setOnClickListener{

                }

            }
        }

        searchBtn.setOnClickListener{
            val view = layoutInflater.inflate(R.layout.activity_popup_keyword, null)
            val window = PopupWindow(this)
            window.contentView = view
            window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.isOutsideTouchable = true
            window.showAtLocation(view, Gravity.CENTER,0, 0)
        }
    }
}