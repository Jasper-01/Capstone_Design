package com.example.app

import android.graphics.Color
import android.widget.EditText

object editText{
    public fun enableEditText(editText: EditText) {
        editText.isFocusable = true
        editText.isEnabled = true
        editText.isCursorVisible = true
//        editText.keyListener = null
        editText.setBackgroundColor(Color.TRANSPARENT)
    }

    public fun disableEditText(editText: EditText) {
        editText.isFocusable = false
        editText.isEnabled = false
        editText.isCursorVisible = false
        editText.keyListener = null
        editText.setBackgroundColor(Color.TRANSPARENT)
    }

    fun hello(): String {
        return "hello"
    }
}
