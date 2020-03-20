package com.example.animationtestdemo

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.BitmapFactory.*
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyBitmapView(context: Context, attributeSet: AttributeSet): View(context, attributeSet)  {

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        val bitmap = decodeResource(context.resources, R.drawable.icon1)
        canvas?.drawBitmap(bitmap, 50F, 100F, paint)
    }
}