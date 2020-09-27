package com.sobhan.weatherdemo.domain.model.daily

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Daily(
    @PrimaryKey(autoGenerate = true) var id:Long,
    var dt:Int,
    var weatherId:Int,
    var minTemp:Double,
    var maxTemp:Double
) {


}