package com.example.marcin.day5bootcamp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.marcin.day5bootcamp.Model.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val adapter = MyAdapter(this, {startNewActivity(this)})
        recyclerView.adapter = adapter
        println(recyclerView.adapter.itemCount)

    }

    fun startNewActivity(context: Context){
        val intent = Intent(context,  DetailsActivity::class.java)
        this.startActivity(intent);
    }
}
