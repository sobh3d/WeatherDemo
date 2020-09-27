package com.sobhan.weatherdemo.di.component

import android.app.Application
import com.sobhan.weatherdemo.MainApplication
import com.sobhan.weatherdemo.di.module.ActivityModule
import com.sobhan.weatherdemo.di.module.ApplicationModule
import com.sobhan.weatherdemo.di.module.DatabaseModule
import com.sobhan.weatherdemo.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        ActivityModule::class,
        DatabaseModule::class,
        NetworkModule::class
    ]
)

interface ApplicationComponent:AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }


}