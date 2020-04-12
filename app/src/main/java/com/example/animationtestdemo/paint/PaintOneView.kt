package com.example.animationtestdemo.paint

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

class PaintOneView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    val paint = Paint()


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.setColor(Color.GRAY)
        canvas?.drawRect(30F, 40F, 170F, 140F, paint)
    }
}