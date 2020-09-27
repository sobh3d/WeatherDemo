package com.sobhan.weatherdemo.di.module

import com.sobhan.weatherdemo.presentation.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module(includes = [AndroidSupportInjectionModule::class])
interface ActivityModule{
    @ContributesAndroidInjector
    fun mainActivityInjector(): MainActivity

}