package com.sobhan.weatherdemo.di.module

import android.app.Application
import androidx.room.Room
import com.sobhan.weatherdemo.data.source.local.AppDatabase
import com.sobhan.weatherdemo.data.source.local.dao.WeatherDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    internal fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            AppDatabase.DB_NAME
        ).allowMainThreadQueries().build()
    }

    @Provides
    internal fun providePhotoDao(appDatabase: AppDatabase): WeatherDao {
        return appDatabase.weatherDao
    }
}