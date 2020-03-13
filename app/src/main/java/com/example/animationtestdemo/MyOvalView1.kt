package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyOvalView1(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()

        paint.style = Paint.Style.FILL
        paint.strokeCap = Paint.Cap.ROUND

        canvas?.drawOval(20F, 20F, 80F, 50F, paint)
    }
}