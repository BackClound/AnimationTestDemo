package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class PaintOneViewTwo(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    val paint = Paint()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.BLUE

        canvas?.drawText("This is a message",10F, 20F,paint)
    }
}