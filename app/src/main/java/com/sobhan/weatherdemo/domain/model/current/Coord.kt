package com.sobhan.weatherdemo.domain.model.current

import com.google.gson.annotations.SerializedName

data class Coord(
    @SerializedName("lon") val lon:Double,
    @SerializedName("lat") val lat:Double
    )
{
}