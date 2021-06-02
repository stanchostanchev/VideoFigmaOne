package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class CmpItemMetaDataDownload(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {

    lateinit var clItemMetaDataDownload:ConstraintLayout
    lateinit var imvDownload: ImageView
    lateinit var tvFileSize:TextView
    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.item_meta_download, this)

        clItemMetaDataDownload = findViewById(R.id.clItemMetaDataDownload)
        imvDownload = findViewById(R.id.imvDownload)
        tvFileSize = findViewById(R.id.tvFileSize)
    }

    init {
        initComponent(context)
    }

}