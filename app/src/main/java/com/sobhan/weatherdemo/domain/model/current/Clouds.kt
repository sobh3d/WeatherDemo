package com.sobhan.weatherdemo.domain.model.current

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all") val all: Int


) {
}