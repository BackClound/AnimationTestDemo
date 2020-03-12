package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyCircle1View(context: Context, attr: AttributeSet?) : View(context, attr) {

    val paint = Paint()
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.color = Color.RED
        paint.isAntiAlias = false
        paint.strokeWidth = 5F
        canvas?.drawCircle(70F,70F,50F, paint)
    }


}