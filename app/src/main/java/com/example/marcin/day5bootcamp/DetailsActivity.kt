package com.example.marcin.day5bootcamp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setImg()
        collapsingToolbarLayout.title = "Custom title"
    }

    fun setImg(){
        Picasso.with(this)
                .load("https://unsplash.it/500/500?image=21")
                .fit()
                .into(mainImageView)
    }
}
