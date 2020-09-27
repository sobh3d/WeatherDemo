package com.sobhan.weatherdemo.domain.usecase

import com.sobhan.weatherdemo.domain.model.current.WeatherDto
import com.sobhan.weatherdemo.domain.repository.WeatherRepository
import com.sobhan.weatherdemo.domain.usecase.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(private val repository: WeatherRepository) : SingleUseCase<WeatherDto>() {
    override  fun buildUseCaseSingle(): Single<WeatherDto> {
        return repository.getWeather()
    }
}