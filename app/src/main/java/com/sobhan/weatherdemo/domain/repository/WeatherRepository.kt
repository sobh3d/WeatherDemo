package com.sobhan.weatherdemo.domain.repository

import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto
import io.reactivex.Single

interface WeatherRepository {
     fun getWeather():Single<WeatherDto>
     fun addCurrentWeather(weather: WeatherDto)
     fun getDailyWeather():Single<WeatherDailyDto>

}