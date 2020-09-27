package com.sobhan.weatherdemo.domain.usecase

import com.sobhan.weatherdemo.domain.model.daily.WeatherDailyDto
import com.sobhan.weatherdemo.domain.repository.WeatherRepository
import com.sobhan.weatherdemo.domain.usecase.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class getDailyWeatherUseCase @Inject constructor(private val repository: WeatherRepository):
    SingleUseCase<WeatherDailyDto>() {
    override fun buildUseCaseSingle(): Single<WeatherDailyDto> {
        return repository.getDailyWeather()
    }
}