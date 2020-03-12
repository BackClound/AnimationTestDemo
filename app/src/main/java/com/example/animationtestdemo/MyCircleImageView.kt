package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ImageView

class MyCircleImageView(context: Context, attributeSet: AttributeSet) : ImageView(context, attributeSet) {

    val paint = Paint()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawCircle(0F,0F,50F,paint)
//        canvas.drawBitmap()
    }
}
