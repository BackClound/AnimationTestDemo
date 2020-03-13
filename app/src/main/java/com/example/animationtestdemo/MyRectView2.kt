package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyRectView2(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.style = Paint.Style.STROKE
        paint.strokeCap = Paint.Cap.SQUARE
        paint.strokeWidth = 20F
        canvas?.drawRect(50F,50F,300F,300F, paint)

    }
}