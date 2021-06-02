package com.uicomponents.dev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deseretbook.uicomponents.CmpRating
import com.deseretbook.uicomponents.CmpRatingBar
import com.deseretbook.uicomponents.R


class MainActivity : AppCompatActivity() {

    lateinit var cmpRatingBar: CmpRatingBar
    lateinit var cmpRating: CmpRating

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cmpRating = findViewById(R.id.cmpRating)
        cmpRating.setRatingValues(0,200,300,400,2000)



    }


}