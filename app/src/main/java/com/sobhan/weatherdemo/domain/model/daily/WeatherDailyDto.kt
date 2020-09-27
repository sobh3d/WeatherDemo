package com.sobhan.weatherdemo.domain.model.daily

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.sobhan.weatherdemo.util.DataConvertor
import kotlin.collections.List

@Entity(tableName = "forecast")
@TypeConverters(DataConvertor::class)
data class WeatherDailyDto(
    @PrimaryKey(autoGenerate = true) val id:Long,
    @SerializedName("cod") val cod:String,
    @SerializedName("message") val message:Int,
    @SerializedName("cnt") val cnt:Int,
    @SerializedName("list") val list: List<com.sobhan.weatherdemo.domain.model.daily.List>
) {
}