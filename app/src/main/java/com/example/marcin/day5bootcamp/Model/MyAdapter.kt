package com.example.marcin.day5bootcamp.Model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcin.day5bootcamp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_view.view.*

/**
 * Created by Marcin on 22.09.2017.
 */
class MyAdapter(val context: Context, val startNewActivity: (context: Context) -> Unit) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val mItems: MutableList<Item>

    init{
        val itemRepo = ItemRepo()
        mItems = itemRepo.getAll()
        Log.d("Adapter", mItems.size.toString())
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bindItems(item: Item){
            Log.d("bindItem", "binding")
            setImage(item, view)
            setListener(view)
        }
    }

    private fun setImage(item: Item, view: View){
        Picasso.with(context)
                .load(item.url)
                .fit()
                .into(view.imageView)
    }
    private fun setListener(view: View){
        view.setOnClickListener{
            startNewActivity(context)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(mItems[position])
    }

    override fun getItemCount(): Int = mItems.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        return ViewHolder(layoutInflater.inflate(R.layout.list_item_view, parent, false))
    }
}