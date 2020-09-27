package com.sobhan.weatherdemo.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCurrentWeather(weatherDto: WeatherDto): Long
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addDailyWeather(weatherDailyDto: WeatherDailyDto): Long

}