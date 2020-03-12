package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class MyLocalView1(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRGB(100,200,100)
    }
}