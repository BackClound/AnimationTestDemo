package com.example.animationtestdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class MyPathView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        paint.style = Paint.Style.STROKE
        val path = Path()

        path.addArc(200F, 200F, 400F, 400F, -225F, 225F)


        path.arcTo(400F, 200F, 600F, 400F, -180F, 225F, false)

        path.lineTo(400F, 542F)
        path.lineTo(200F, 400F)
        canvas?.drawPath(path, paint)
    }
}