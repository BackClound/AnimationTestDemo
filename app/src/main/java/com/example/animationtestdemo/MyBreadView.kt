package com.example.animationtestdemo

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.View
import kotlin.math.cos
import kotlin.math.sin

class MyBreadView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.isAntiAlias = true
        paint.color = Color.RED

        val path = Path()

        path.addArc(
            (50F),
            (50F),
            200F,
            200F,
            0F,
            70F
        )
        path.lineTo(125F, 125F)
        val matrix = Matrix()
        matrix.setTranslate(-10F * cos(35F), -10F * sin(35F))
        path.transform(matrix)
        Log.e(" ====  A ", " x is ${cos(35F)} and y is ${sin(35F)}")
        Log.e(" ====  A ", " x is ${Math.cos(35.toDouble())} and y is ${sin(35F)}")

        canvas?.drawPath(path, paint)

        val path2 = Path()

        path2.addArc(
            50F,
            50F,
            200F,
            200F,
            70F,
            60F
        )
        path2.lineTo(125F, 125F)

        val paint2 = Paint()
        paint2.style = Paint.Style.FILL
        paint2.isAntiAlias = true
        paint2.color = Color.BLUE

        val matrix2 = Matrix()

        matrix2.setTranslate(10F * cos(80F), -10F * sin(80F))
        path2.transform(matrix2)
        //这里有一个错误， cos(x)和sin(x)中的参数x不是指角度，而是角度对应的弧度，所以应进行对应的转换
        Log.e(" ====  B ", " x is ${cos(80F)} and y is ${sin(80F)}")
//        canvas?.translate(3F, 3F)
        canvas?.drawPath(path2, paint2)

        val paint3 = Paint()
        paint3.style = Paint.Style.FILL
        paint3.isAntiAlias = true
        paint3.color = Color.BLACK

        val path3 = Path()
        path3.addArc(
            50F,
            50F,
            200F,
            200F,
            130F,
            80F
        )
        path3.lineTo(125F, 125F)


        val matrix3 = Matrix()
        matrix3.setTranslate(10F * cos(10F), -10F * sin(10F))
        Log.e(" ====  C ", " x is ${cos(10F)} and y is ${sin(10F)}")

        path3.transform(matrix3)
        canvas?.drawPath(path3, paint3)

        val paint4 = Paint()
        paint4.color = Color.GREEN
        paint4.style = Paint.Style.FILL
        paint4.isAntiAlias = true

        val path4 = Path()
        path4.addArc(
            50F,
            50F,
            200F,
            200F,
            210F,
            150F
        )
        path4.lineTo(125F,125F)

        val matrix4 = Matrix()
        matrix4.setTranslate(10F* cos(75F), 10F* sin(75F))
        Log.e(" ====  D ", " x is ${cos(75F)} and y is ${sin(75F)}")
        path4.transform(matrix4)
        canvas?.drawPath(path4, paint4)
    }
}