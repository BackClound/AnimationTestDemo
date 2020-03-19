package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyLineView1(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 5F
        paint.strokeCap = Paint.Cap.ROUND
//        val points =
        canvas?.drawLine(50F, 50F, 100F, 80F, paint)
    }
}