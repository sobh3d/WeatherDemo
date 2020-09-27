package com.sobhan.weatherdemo.di.module

import android.app.Application
import android.content.Context
import com.sobhan.weatherdemo.di.builder.ViewModelsFactoryBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelsFactoryBuilder::class])
class ApplicationModule {
    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext
}