package com.sobhan.weatherdemo.di.builder

import androidx.lifecycle.ViewModel
import com.sobhan.weatherdemo.di.ViewModelKey
import com.sobhan.weatherdemo.presentation.viewmodel.WeatherViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsBuilder {

    @Binds
    @IntoMap
    @ViewModelKey(WeatherViewModel::class)
    abstract fun bindAlbumsViewModel(weatherViewModel: WeatherViewModel): ViewModel
}