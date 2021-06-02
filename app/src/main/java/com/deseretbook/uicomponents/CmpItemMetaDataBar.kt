package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.*

class CmpItemMetaDataBar(context: Context, attributeSet: AttributeSet) : GridLayout(context, attributeSet) {

    lateinit var cmpDownload: CmpItemMetaDataDownload
    lateinit var cmpRuntime: CmpItemMetaDataTwoLineText
    lateinit var cmpRelease: CmpItemMetaDataTwoLineText
    lateinit var cmpRateSquare: CmpRatingSquare
    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.item_meta_data_bar, this)

        cmpDownload = findViewById(R.id.cmpItemMetaDataDownload)
        cmpRuntime = findViewById(R.id.cmpTwoLineText1)
        cmpRelease = findViewById(R.id.cmpTwoLineText2)
        cmpRateSquare = findViewById(R.id.cmpRatingSquare)

        cmpRateSquare.doScale()
    }

    init {
        initComponent(context)
    }


}