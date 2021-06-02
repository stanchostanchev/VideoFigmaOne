package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout


class CmpRating(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {

    lateinit var cmpRatingSquare: CmpRatingSquare
    lateinit var cmpRatingBarStack: CmpRatingBarStack
    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.rating_component, this)

        cmpRatingBarStack = findViewById(R.id.cmpRatingStack)
        cmpRatingSquare = findViewById(R.id.cmpRatingSquare)
    }

    init {
        initComponent(context)
    }

    fun setRatingValues(val1:Int, val2:Int, val3:Int, val4:Int, val5:Int, ){
        val total = val1 + val2 + val3 + val4 + val5
        var v1 = 0f
        var v2 = 0f
        var v3 = 0f
        var v4 = 0f
        var v5 = 0f
        if( total != 0 ){
            v1 = (val1.toFloat() / total) * 100
            v2 = (val2.toFloat() / total) * 100
            v3 = (val3.toFloat() / total) * 100
            v4 = (val4.toFloat() / total) * 100
            v5 = (val5.toFloat() / total) * 100
        }

        cmpRatingBarStack.apply {
            cmpRb1.setPercent(v1.toInt())
            cmpRb2.setPercent(v2.toInt())
            cmpRb3.setPercent(v3.toInt())
            cmpRb4.setPercent(v4.toInt())
            cmpRb5.setPercent(v5.toInt())
        }

    }
}