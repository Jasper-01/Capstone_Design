package com.example.app

import android.graphics.Color
import android.widget.EditText

object editText{
    public fun enableEditText(editText: EditText?) {
        editText?.isFocusable = true
        editText?.isFocusableInTouchMode = true
        editText?.isEnabled = true
        editText?.isCursorVisible = true
//        editText.keyListener = null
        editText?.setBackgroundColor(Color.TRANSPARENT)
    }

    public fun disableEditText(editText: EditText?) {
        editText?.isFocusable = false
        editText?.isFocusableInTouchMode = false
        editText?.isEnabled = false
        editText?.isCursorVisible = false
//        editText?.keyListener = null
        editText?.setBackgroundColor(Color.TRANSPARENT)
    }
}
