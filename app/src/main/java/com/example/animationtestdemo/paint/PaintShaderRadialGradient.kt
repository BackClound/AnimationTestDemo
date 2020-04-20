package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class PaintShaderRadialGradient(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val colors = intArrayOf(Color.parseColor("#220044"), Color.parseColor("#446699"), Color.parseColor("#774455"))
        val stops = floatArrayOf(0.3F, 0.4F, 0.3F)
        val shader = RadialGradient(150F,150F, 50F,colors, stops, Shader.TileMode.REPEAT)
        paint.setShader(shader)

        canvas?.drawCircle(200F,200F,100F, paint)
    }
}