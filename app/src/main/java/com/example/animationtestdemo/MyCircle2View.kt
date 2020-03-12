package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyCircle2View(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    val paint = Paint()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.style = Paint.Style.FILL
        paint.isAntiAlias = false
        paint.color = Color.BLACK
//        paint.strokeWidth = 10F
        paint.alpha = 70
        canvas?.drawCircle(70F,70F, 50F, paint)

    }
}