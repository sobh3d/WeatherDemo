package com.sobhan.weatherdemo.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sobhan.weatherdemo.domain.model.current.*

class DataConvertor {

    @TypeConverter
    fun fromList(list: List<com.sobhan.weatherdemo.domain.model.daily.List>): String{
        val gson= Gson()
        val type = object : TypeToken<com.sobhan.weatherdemo.domain.model.daily.List>(){}.type
        return gson.toJson(list,type)
    }
    @TypeConverter
    fun toList(list:String): List<com.sobhan.weatherdemo.domain.model.daily.List> {
        val gson= Gson()
        val type = object : TypeToken<com.sobhan.weatherdemo.domain.model.daily.List>(){}.type
        return gson.fromJson(list,type)
    }

    @TypeConverter
    fun fromCoord(coord: Coord): String{
        val gson= Gson()
        val type = object : TypeToken<Coord>(){}.type
        return gson.toJson(coord,type)
    }
    @TypeConverter
    fun toCoord(coord:String): Coord {
        val gson= Gson()
        val type = object : TypeToken<Coord>(){}.type
        return gson.fromJson(coord,type)
    }

    @TypeConverter
    fun fromWeather(weather:List<Weather>): String{
        val gson= Gson()
        val type = object : TypeToken<List<Weather>>(){}.type
        return gson.toJson(weather,type)
    }
    @TypeConverter
    fun toWeather(weather:String): List<Weather>{
        val gson= Gson()
        val type = object : TypeToken<List<Weather>>(){}.type
        return gson.fromJson(weather,type)
    }

    @TypeConverter
    fun fromMain(main: Main): String{
        val gson= Gson()
        val type = object : TypeToken<Main>(){}.type
        return gson.toJson(main,type)
    }
    @TypeConverter
    fun toMain(main:String): Main {
        val gson= Gson()
        val type = object : TypeToken<Main>(){}.type
        return gson.fromJson(main,type)
    }

    @TypeConverter
    fun fromWind(wind: Wind): String{
        val gson= Gson()
        val type = object : TypeToken<Wind>(){}.type
        return gson.toJson(wind,type)
    }
    @TypeConverter
    fun toWind(wind:String): Wind {
        val gson= Gson()
        val type = object : TypeToken<Wind>(){}.type
        return gson.fromJson(wind,type)
    }

    @TypeConverter
    fun fromClouds(clouds: Clouds): String{
        val gson= Gson()
        val type = object : TypeToken<Clouds>(){}.type
        return gson.toJson(clouds,type)
    }
    @TypeConverter
    fun toClouds(clouds: String): Clouds {
        val gson= Gson()
        val type = object : TypeToken<Clouds>(){}.type
        return gson.fromJson(clouds,type)
    }
}