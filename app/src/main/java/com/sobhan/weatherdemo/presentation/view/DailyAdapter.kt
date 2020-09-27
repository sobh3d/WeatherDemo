package com.sobhan.weatherdemo.presentation.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sobhan.weatherdemo.R
import com.sobhan.weatherdemo.util.AnimationUtil
import com.sobhan.weatherdemo.util.DateConvertor
import kotlinx.android.synthetic.main.daily_item.view.*
import java.text.SimpleDateFormat
import java.util.*

class DailyAdapter(private val items: List<com.sobhan.weatherdemo.domain.model.daily.List>) : RecyclerView.Adapter<DailyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.daily_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       holder.bind(items[position])

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val loti: AnimationUtil = AnimationUtil()
        @SuppressLint("SetTextI18n", "SimpleDateFormat")
        fun bind(item: com.sobhan.weatherdemo.domain.model.daily.List) {
                   var date= DateConvertor()
                    textViewDayOfWeek.text = date.day(item.dtText)

                    textViewMax.text = item.main.temp_max.toInt().toString()
                    textViewMin.text = item.main.temp_min.toInt().toString()
                    textViewDailyTemp.text = item.main.temp.toInt().toString()+ "°"
                    animation.setAnimation(loti.getWeatherAnimation(item.weather[0].id))
                    animation.playAnimation()




        }

            val textViewDayOfWeek = itemView.tv_day_of_week
            val textViewDailyTemp  = itemView.tv_daily_temp
            val textViewMin = itemView.tv_min_daily_temp
            val textViewMax  = itemView.tv_max_daily_temp
            val animation = itemView.anim_weather_daily






    }



}