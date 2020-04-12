package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class PaintOneViewOne(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    val paint = Paint()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.setColor(Color.RED)
        paint.style = Paint.Style.FILL

        canvas?.drawLine(40F,30F, 250F,80F, paint)
    }
}