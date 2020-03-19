package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyLineView2(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10F
        paint.strokeCap = Paint.Cap.BUTT

        val points = floatArrayOf(20F, 20F, 120F, 20F, 70F, 20F, 70F, 120F, 20F, 120F, 120F, 120F)
        canvas?.drawLines(points, paint)

    }


}