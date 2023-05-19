package com.noreplypratap.weatherapplication.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.noreplypratap.weatherapplication.R
import com.noreplypratap.weatherapplication.models.TodaysWeatherInfo
import com.noreplypratap.weatherapplication.models.WeatherDetails

class WeatherDetailsAdapter(private var itemList : MutableList<WeatherDetails>) : RecyclerView.Adapter<WeatherDetailsAdapter.ViewHolder>()  {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var wdInfo: TextView = itemView.findViewById(R.id.wdInfo)
        var wdIcon: ImageView = itemView.findViewById(R.id.wdIcon)
        var wdTemp: TextView = itemView.findViewById(R.id.wdTemp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.weather_details_cards,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data  = itemList[position]
        holder.itemView.apply {
            holder.wdInfo.text = data.wdInfo
            holder.wdTemp.text = data.wdTemp
            holder.wdIcon.setImageResource(data.wdIcon)
        }
    }
}