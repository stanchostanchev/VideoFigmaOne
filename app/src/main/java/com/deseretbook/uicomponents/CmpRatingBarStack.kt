package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout


class CmpRatingBarStack(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {

    lateinit var cmpRb5: CmpRatingBar
    lateinit var cmpRb4: CmpRatingBar
    lateinit var cmpRb3: CmpRatingBar
    lateinit var cmpRb2: CmpRatingBar
    lateinit var cmpRb1: CmpRatingBar

    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.rating_bars_stack, this)
        cmpRb1 = findViewById(R.id.rating_bar_1)
        cmpRb2 = findViewById(R.id.rating_bar_2)
        cmpRb3 = findViewById(R.id.rating_bar_3)
        cmpRb4 = findViewById(R.id.rating_bar_4)
        cmpRb5 = findViewById(R.id.rating_bar_5)

        cmpRb1.tvRate.text = "1"
        cmpRb2.tvRate.text = "2"
        cmpRb3.tvRate.text = "3"
        cmpRb4.tvRate.text = "4"
        cmpRb5.tvRate.text = "5"
    }


    init {
        initComponent(context)
    }
}