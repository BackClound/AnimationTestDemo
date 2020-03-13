package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyPaintView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
//        val points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50}
        val points = floatArrayOf(0F, 0F, 50F, 50F, 50F, 100F, 100F, 50F, 100F, 100F, 150F, 50F)
        val paint = Paint()
        paint.style = Paint.Style.STROKE
        paint.strokeWidth =10F
        paint.strokeCap = Paint.Cap.ROUND
        canvas?.drawPoints(points, paint)
    }
}