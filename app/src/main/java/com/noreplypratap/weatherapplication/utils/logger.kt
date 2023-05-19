package com.noreplypratap.weatherapplication.utils

import android.util.Log

fun logger(tag: String, msg: String) {
    Log.d(tag,msg)
}

fun loggerWithoutTag(msg: String) {
    Log.d("WeatherAppTag",msg)
}