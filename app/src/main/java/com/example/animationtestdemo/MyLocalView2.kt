package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class MyLocalView2(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawARGB(100,100,200,100)
    }
}