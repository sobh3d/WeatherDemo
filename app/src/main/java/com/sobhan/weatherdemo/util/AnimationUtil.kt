package com.sobhan.weatherdemo.util

import com.sobhan.weatherdemo.R

 class AnimationUtil {

    fun getWeatherAnimation(code: Int): Int {
        if (code / 100 == 2) {
            return R.raw.storm_weather;
        } else if (code / 100 == 3) {
            return R.raw.rainy_weather;
        } else if (code / 100 == 5) {
            return R.raw.rainy_weather;
        } else if (code / 100 == 6) {
            return R.raw.snow_weather;
        } else if (code / 100 == 7) {
            return R.raw.unknown;
        } else if (code == 800) {
            return R.raw.clear_day;
        } else if (code == 801) {
            return R.raw.few_clouds;
        } else if (code == 803) {
            return R.raw.broken_clouds;
        } else if (code / 100 == 8) {
            return R.raw.cloudy_weather;
        }
        return R.raw.unknown;
    }
}