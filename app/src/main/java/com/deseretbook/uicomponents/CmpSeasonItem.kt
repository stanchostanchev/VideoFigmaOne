package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class CmpSeasonItem(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {



    lateinit var imvScreenshot:ImageView
    lateinit var imvPlayButton:ImageView
    lateinit var tvDescription:TextView
    lateinit var tvTitle: TextView
    lateinit var imvDownload:ImageView
    lateinit var tvFileSize:TextView
    lateinit var tvDuration:TextView
    lateinit var tvDelimiter:TextView

    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.season_recycler_item, this)

        imvScreenshot = findViewById(R.id.imvSeasonItemScreenShot)
        imvPlayButton = findViewById(R.id.imvSeasonItemPlayButton)
        tvDescription = findViewById(R.id.tvSeasonItemDescription)
        tvTitle = findViewById(R.id.tvSeasonItemTitle)
        tvFileSize = findViewById(R.id.tvReviewItemDate)
        tvDuration = findViewById(R.id.tvReviewItemVerified)
        tvDelimiter = findViewById(R.id.tvSeasonItemDelimiter)
        imvDownload = findViewById(R.id.imvStar1)
    }

    init {
        initComponent(context)
    }

}