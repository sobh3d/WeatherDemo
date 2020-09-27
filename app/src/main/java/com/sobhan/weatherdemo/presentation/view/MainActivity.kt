package com.sobhan.weatherdemo.presentation.view


import android.annotation.SuppressLint
import android.os.Bundle

import android.widget.LinearLayout



import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.sobhan.weatherdemo.R


import com.sobhan.weatherdemo.presentation.viewmodel.WeatherViewModel
import com.sobhan.weatherdemo.util.AnimationUtil

import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(){
    var dailyList: List<com.sobhan.weatherdemo.domain.model.daily.List> = listOf()

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private  val viewModel: WeatherViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(WeatherViewModel::class.java)
    }


    private val anime: AnimationUtil = AnimationUtil()


    @SuppressLint("SetTextI18n", "WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_forcast.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)

        with(viewModel){
            loadWeather()
            weatherReceivedLiveData.observe(this@MainActivity, Observer {
                tv_temp.text = it?.get(0)?.main?.temp?.toInt().toString() + "°"
                tv_humidity.text = "Humidity"+ " " + it?.get(0)?.main?.humidity.toString() + "%"
                tv_desc.text = it?.get(0)?.weathers?.get(0)?.main
                tv_Wind.text = "Wind"+ " " + it?.get(0)?.wind?.speed?.toInt().toString() + " km/hr"
                anim_lottie.setAnimation(anime.getWeatherAnimation(it[0].weathers[0].id))
                anim_lottie.playAnimation()
            })

            dailyWeatherReceivedLiveData.observe(this@MainActivity, Observer {
                    dailyList = it.list
                var adapter =  DailyAdapter(dailyList)
                rv_forcast.adapter = adapter


            })





        }


    }




}
