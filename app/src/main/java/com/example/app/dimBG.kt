package com.example.app

import android.content.Context
import android.view.View
import android.view.WindowManager

import android.widget.PopupWindow

object dimBG {

    fun dimBehind(popupWindow: PopupWindow) {
        val container: View = popupWindow.contentView.rootView
        val context: Context = popupWindow.contentView.context
        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val p = container.getLayoutParams() as WindowManager.LayoutParams
        p.flags = p.flags or WindowManager.LayoutParams.FLAG_DIM_BEHIND
        p.dimAmount = 0.5f
        wm.updateViewLayout(container, p)
    }
}