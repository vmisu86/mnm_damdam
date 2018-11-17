package com.example.vmisu.projet

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView : View {


    private var mPaint = Paint()
    private fun init() {
        mPaint.color = Color.BLUE
    }
    constructor(context: Context) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    var mCircle = MagicCircle(800F,600F)

    companion object {
        val DELTA = 8
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bot: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mCircle.delta = DELTA
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mCircle.move()
        canvas?.drawCircle(mCircle.cx, mCircle.cy, mCircle.rad, mPaint)
        invalidate()

    }
}