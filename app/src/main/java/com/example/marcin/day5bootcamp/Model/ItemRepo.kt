package com.example.marcin.day5bootcamp.Model

/**
 * Created by Marcin on 22.09.2017.
 */
class ItemRepo {

    val itemList = mutableListOf<Item>(
            Item("https://unsplash.it/500/500?image=21", ""),
            Item("https://unsplash.it/500/500?image=22", ""),
            Item("https://unsplash.it/500/500?image=23", ""),
            Item("https://unsplash.it/500/500?image=24", ""),
            Item("https://unsplash.it/500/500?image=25", ""),
            Item("https://unsplash.it/500/500?image=26", ""),
            Item("https://unsplash.it/500/500?image=27", ""),
            Item("https://unsplash.it/500/500?image=28", ""),
            Item("https://unsplash.it/500/500?image=29", ""),
            Item("https://unsplash.it/500/500?image=20", "")
    )

    fun getAll() : MutableList<Item>{
        return itemList
    }
}