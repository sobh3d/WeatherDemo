package com.sobhan.weatherdemo.domain.model.daily

import com.google.gson.annotations.SerializedName
import com.sobhan.weatherdemo.domain.model.current.Clouds
import com.sobhan.weatherdemo.domain.model.current.Main
import com.sobhan.weatherdemo.domain.model.current.Weather
import com.sobhan.weatherdemo.domain.model.current.Wind
import kotlin.collections.List

data class List(
     @SerializedName("dt") val dt:Int,
     @SerializedName("main") val main:Main,
     @SerializedName("weather") val weather: List<Weather>,
     @SerializedName("clouds") val clouds: Clouds,
     @SerializedName("wind") val wind: Wind,
     @SerializedName("visibility") val visibility: Int,
     @SerializedName("pop") val pop:Double,
     @SerializedName("dt_txt") val dtText:String


 ) {
}