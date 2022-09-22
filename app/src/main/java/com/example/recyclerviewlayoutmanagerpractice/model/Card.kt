package com.example.recyclerviewlayoutmanagerpractice.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Card(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
