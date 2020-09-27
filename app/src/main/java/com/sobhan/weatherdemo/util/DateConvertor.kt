package com.sobhan.weatherdemo.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

class DateConvertor {

    @SuppressLint("SimpleDateFormat")
    fun day(day:String):String{
        var informat = SimpleDateFormat("yyyy-mm-dd hh:mm:ss")
        var date = informat.parse(day)
        var outFormat = SimpleDateFormat("EEEE", Locale.ENGLISH)
        return outFormat.format(date)
    }


    fun time(time:String): String{
        var informat = SimpleDateFormat("hh:mm")
        var date = informat.parse(time)

        return informat.format(date)
    }
}