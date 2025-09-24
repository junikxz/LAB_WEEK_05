package com.example.lab_week_05

import com.google.gson.annotations.SerializedName

data class ImageData(
    @SerializedName("url")
    val imageUrl: String? = null,

    @SerializedName("breeds")
    val breeds: List<Breed>? = null
)

data class Breed(
    @SerializedName("name")
    val name: String? = null
)
