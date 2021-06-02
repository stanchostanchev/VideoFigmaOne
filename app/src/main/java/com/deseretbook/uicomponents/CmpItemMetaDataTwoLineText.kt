package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class CmpItemMetaDataTwoLineText(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {


    lateinit var tvLine1:TextView
    lateinit var tvLine2:TextView
    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.item_meta_two_line_text, this)

        tvLine1 = findViewById(R.id.tvLine1)
        tvLine2 = findViewById(R.id.tvLine2)

    }

    init {
        initComponent(context)
    }

}