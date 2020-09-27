package com.sobhan.weatherdemo.data.source.remote

import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("weather")
    fun getCurrentWeather(@Query("q") q:String,
                          @Query("appid") appid:String,
                          @Query("units") units:String): Single<WeatherDto>

    @GET("forecast")
    fun getDailyWeather(@Query("q") q:String,
                        @Query("cnt") cnt:String,
                        @Query("appid") appid:String,
                        @Query("units") units:String): Single<WeatherDailyDto>
}