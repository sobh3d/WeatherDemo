package com.sobhan.weatherdemo.domain.model.current

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.sobhan.weatherdemo.util.DataConvertor

@Entity(tableName = "weather")
@TypeConverters(DataConvertor::class)
data class WeatherDto(
    @SerializedName("coord") val coord: Coord,
    @SerializedName("weather") val weathers:List<Weather>,
    @SerializedName("base") val base:String,
    @SerializedName("main") val main: Main,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("dt") val dt:Int,
    @SerializedName("timezone") val timezone:Int,
    @PrimaryKey
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name:String,
    @SerializedName("cod") val cod:Int
) {
}