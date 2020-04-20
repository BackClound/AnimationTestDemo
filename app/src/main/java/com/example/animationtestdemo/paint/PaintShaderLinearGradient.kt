package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class PaintShaderLinearGradient(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val shader = LinearGradient(25F,25F,400F,400F,Color.parseColor("#440000"),Color.parseColor("#2196F3"),Shader.TileMode.CLAMP)
        paint.setShader(shader)

        canvas?.drawCircle(212.5F, 212.5F, 100F, paint)

    }
}