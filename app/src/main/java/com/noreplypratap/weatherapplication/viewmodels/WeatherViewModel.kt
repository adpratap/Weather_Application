package com.noreplypratap.weatherapplication.viewmodels

import androidx.lifecycle.ViewModel
import com.noreplypratap.weatherapplication.R
import com.noreplypratap.weatherapplication.models.DayDetails
import com.noreplypratap.weatherapplication.models.DayInfo
import com.noreplypratap.weatherapplication.models.TodaysWeatherInfo
import com.noreplypratap.weatherapplication.models.WeatherDetails


class WeatherViewModel : ViewModel() {


    // Due to time constraint i am using direct functions to get data ...

    fun getTodaysWeatherInfo(): List<TodaysWeatherInfo> {
        return listOf(
            TodaysWeatherInfo("Now", R.drawable.ic_cloud, "18°"),
            TodaysWeatherInfo("15:00", R.drawable.ic_cloudy, "17°"),
            TodaysWeatherInfo("16:00", R.drawable.ic_foggy, "17°"),
            TodaysWeatherInfo("17:00", R.drawable.ic_cloudy, "16°"),
            TodaysWeatherInfo("18:00", R.drawable.ic_cloudy, "16°"),
            TodaysWeatherInfo("19:00", R.drawable.ic_cloud, "15°"),
            TodaysWeatherInfo("20:00", R.drawable.ic_sunset, "15°"),
            TodaysWeatherInfo("21:00", R.drawable.ic_moon, "14°"),
            TodaysWeatherInfo("22:00", R.drawable.ic_moon, "14°")
        )
    }

    fun getWeatherDetails(): List<WeatherDetails> {
        return listOf(
          WeatherDetails(R.drawable.ic_temperature,"Feels like","30°"),
          WeatherDetails(R.drawable.ic_air,"W wind","13km/h"),
          WeatherDetails(R.drawable.ic_humidity,"Humidity","62%"),
          WeatherDetails(R.drawable.ic_uv,"UV","0 Very weak"),
          WeatherDetails(R.drawable.ic_visibility,"Visibility","1KM"),
          WeatherDetails(R.drawable.ic_foggy,"Air pressure","1017hpa")
        )
    }

    fun getDayDetails(): List<DayDetails> {
        return listOf(
            DayDetails("Today",R.drawable.ic_cloudy,"Fog","22°/10°"),
            DayDetails("Wed",R.drawable.ic_foggy,"Fog","21°/8°"),
            DayDetails("Thu",R.drawable.ic_foggy,"Fog","21°/10°"),
            DayDetails("Fri",R.drawable.ic_foggy,"Fog","22°/12°"),
            DayDetails("Sat",R.drawable.ic_sunny,"Sunny","20°/8°"),
            DayDetails("Sun",R.drawable.ic_sunny,"Sunny","19°/7°"),
            DayDetails("Mon",R.drawable.ic_sunny,"Sunny","19°/6°")
        )
    }

    fun getDayInfo(): DayInfo {
        return DayInfo(R.drawable.ic_sunset,R.drawable.ic_sunrise,"07:12","17:33")
    }

}