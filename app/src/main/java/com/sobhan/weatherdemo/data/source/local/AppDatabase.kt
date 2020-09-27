package com.sobhan.weatherdemo.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sobhan.weatherdemo.data.source.local.dao.WeatherDao
import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto

@Database(entities = [WeatherDto::class,WeatherDailyDto::class],version = 1,exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

  abstract val weatherDao : WeatherDao

    companion object{
        const val DB_NAME = "WeatherDatabase.db"
    }
}