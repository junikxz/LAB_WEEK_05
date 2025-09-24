package com.example.lab_week_05

import android.content.Context
import android.widget.ImageView

interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}