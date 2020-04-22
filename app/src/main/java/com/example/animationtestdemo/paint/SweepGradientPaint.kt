package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.SweepGradient
import android.util.AttributeSet
import android.view.View

class SweepGradientPaint(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        val shader = SweepGradient(50F, 50F, Color.parseColor("#220044"), Color.parseColor("#885544"))

        paint.setShader(shader)

        canvas?.drawCircle(60F,60F,50F, paint)
    }
}