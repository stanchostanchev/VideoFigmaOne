package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


class CmpRatingBar(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {

    lateinit var imvRatingFill: ImageView
    lateinit var imvRatingTrack:ImageView
    lateinit var tvRate:TextView
    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.rating_bar_with_rate, this)
        imvRatingTrack = findViewById(R.id.rating_track)
        imvRatingFill = findViewById(R.id.rating_fill)
        tvRate = findViewById(R.id.tvRate)
    }


    init {
        initComponent(context)
    }

    fun setPercent(percent:Int){
        post {
            val trackWidth = imvRatingTrack.width
            val fillWidth = trackWidth * (percent.toFloat() / 100 )
            imvRatingFill.layoutParams.width = fillWidth.toInt()
            imvRatingFill.requestLayout()
        }
    }

    fun setCount(count:Int){
        tvRate.text = count.toString()
    }

}