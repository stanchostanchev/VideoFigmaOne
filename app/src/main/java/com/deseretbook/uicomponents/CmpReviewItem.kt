package com.deseretbook.uicomponents

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout


class CmpReviewItem(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {


    private fun initComponent(context: Context) {
        val inflater = context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.review_recycler_item, this)

    }

    init {
        initComponent(context)
    }

}