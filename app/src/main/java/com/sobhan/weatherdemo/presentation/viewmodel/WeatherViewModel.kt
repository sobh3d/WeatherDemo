package com.sobhan.weatherdemo.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto
import com.sobhan.weatherdemo.domain.usecase.GetWeatherUseCase
import com.sobhan.weatherdemo.domain.usecase.getDailyWeatherUseCase
import javax.inject.Inject

class WeatherViewModel  @Inject constructor(private val getWeatherUseCase: GetWeatherUseCase,
private val getDailyWeatherUseCase: getDailyWeatherUseCase): ViewModel() {

    private val TAG = WeatherViewModel::class.java.simpleName
    val weatherReceivedLiveData = MutableLiveData<List<WeatherDto>>()
    val  dailyWeatherReceivedLiveData = MutableLiveData<WeatherDailyDto>()
    val isLoad = MutableLiveData<Boolean>()
    val weatherData = MutableLiveData<WeatherDto>()
    val dailyWeatherData = MutableLiveData<WeatherDailyDto>()


    init {
        isLoad.value = false
    }

    val weather: WeatherDto? get() = weatherData.value
    val dailyWeather: WeatherDailyDto? get() = dailyWeatherData.value

    fun set(weather: WeatherDto) = run { weatherData.value = weather }

     fun loadWeather(){
        getWeatherUseCase.execute(
            onSuccess = {
                isLoad.value = true
                weatherReceivedLiveData.value = listOf(it)
            },
            onError = {
                it.printStackTrace()
            }
        )

         getDailyWeatherUseCase.execute(
             onSuccess = {
                 isLoad.value = true
                 dailyWeatherReceivedLiveData.value = it
             },
             onError = {
                 it.printStackTrace()
             }
         )


    }
}