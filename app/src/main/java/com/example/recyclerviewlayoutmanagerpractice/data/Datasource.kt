package com.example.recyclerviewlayoutmanagerpractice.data

import com.example.recyclerviewlayoutmanagerpractice.R
import com.example.recyclerviewlayoutmanagerpractice.model.Card

class Datasource {
    fun loadCards(): List<Card> =
        listOf(
            Card(R.string.card1, R.drawable.image1),
            Card(R.string.card2, R.drawable.image2),
            Card(R.string.card3, R.drawable.image3),
            Card(R.string.card4, R.drawable.image4),
            Card(R.string.card5, R.drawable.image5)
        )
}