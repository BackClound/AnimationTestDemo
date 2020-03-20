package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class MyCubicView(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val path = Path()
        path.cubicTo(30F,30F, 1500F, 70F, 400F,150F)
        canvas?.drawPath(path, paint)
    }
}