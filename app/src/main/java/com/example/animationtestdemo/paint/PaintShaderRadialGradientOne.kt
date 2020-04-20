package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class PaintShaderRadialGradientOne(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val shader = RadialGradient(150F,150F,50F, Color.parseColor("#334455"), Color.parseColor("#667788"), Shader.TileMode.CLAMP)
        paint.setShader(shader)
        canvas?.drawCircle(150F,150F,200F,paint)
    }
}