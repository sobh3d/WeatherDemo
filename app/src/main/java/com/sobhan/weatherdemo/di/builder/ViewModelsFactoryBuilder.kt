package com.sobhan.weatherdemo.di.builder

import androidx.lifecycle.ViewModelProvider
import com.sobhan.weatherdemo.presentation.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module(includes = [(ViewModelsBuilder::class)])
abstract class ViewModelsFactoryBuilder {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory
}