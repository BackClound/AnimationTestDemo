package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class PaintShaderLinearGradientOne(context: Context, attributeSet: AttributeSet): View(context,attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val colors = intArrayOf(Color.parseColor("#000000"), Color.parseColor("#448833"), Color.parseColor("#884400"))
        val positions = floatArrayOf(30F, 70F, 100F)

        val shader = LinearGradient(20F,20F,400F,400F,colors,null,Shader.TileMode.MIRROR)
        paint.setShader(shader)
        canvas?.drawRect(10F,10F,700F,410F,paint)

    }
}