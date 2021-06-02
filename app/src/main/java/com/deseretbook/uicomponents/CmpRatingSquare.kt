package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class CmpRatingSquare(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {

    lateinit var clMainLayout:ConstraintLayout
    lateinit var clRatingSquare:ConstraintLayout
    lateinit var tvRateNumber:TextView
    lateinit var imvStar:ImageView
    lateinit var tvReviewsCount:TextView
    lateinit var tvLabel:TextView

    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.rating_sqaure, this)
        clMainLayout = findViewById(R.id.clRatingSquare)
        clRatingSquare = findViewById(R.id.clRatingSquare)
        tvRateNumber = findViewById(R.id.tvRateNumber)
        imvStar = findViewById(R.id.imvStar)
        tvReviewsCount = findViewById(R.id.tvReviewsCount)
        tvLabel = findViewById(R.id.tvLabel)
    }


    init {
        initComponent(context)
    }


    fun doScale(){
        clMainLayout.background = null
        (tvRateNumber.layoutParams as ViewGroup.MarginLayoutParams).leftMargin = 50
        tvRateNumber.textSize = 16f
        imvStar.layoutParams.width = 40
        imvStar.layoutParams.height = 40
        (imvStar.layoutParams as ViewGroup.MarginLayoutParams).topMargin = 20

        tvReviewsCount.textSize = 12f
        tvLabel.textSize = 11f
    }

}