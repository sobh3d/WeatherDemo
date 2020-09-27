package com.sobhan.weatherdemo.data.repository

import com.sobhan.weatherdemo.data.source.local.AppDatabase
import com.sobhan.weatherdemo.data.source.remote.Api
import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto
import com.sobhan.weatherdemo.domain.repository.WeatherRepository
import com.sobhan.weatherdemo.util.Constants
import io.reactivex.Single

class WeatherRepositoryImp(private val database:AppDatabase,
private val api:Api): WeatherRepository {
    override  fun getWeather(): Single<WeatherDto> {
        return api.getCurrentWeather(Constants.Q,Constants.API_KEY,Constants.UNI)
    }

    override fun addCurrentWeather(weather: WeatherDto) {

    }

    override fun getDailyWeather(): Single<WeatherDailyDto> {
     return  api.getDailyWeather(Constants.Q,Constants.CNT,Constants.API_KEY,Constants.UNI)
    }


}