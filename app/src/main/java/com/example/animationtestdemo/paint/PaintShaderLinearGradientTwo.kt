package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class PaintShaderLinearGradientTwo(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val colors = intArrayOf(Color.parseColor("#000000"), Color.parseColor("#448833"), Color.parseColor("#884400"))
        val positions = floatArrayOf(0.1F, 0.8F, 0.8F)
        val shader = LinearGradient(10F,10F, 50F,100F, colors, positions, Shader.TileMode.MIRROR)
        paint.setShader(shader)
        canvas?.drawRect(10F,10F, 500F, 150F, paint)
    }
}