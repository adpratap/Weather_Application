package com.noreplypratap.weatherapplication.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.noreplypratap.weatherapplication.R
import com.noreplypratap.weatherapplication.models.DayDetails
import com.noreplypratap.weatherapplication.models.TodaysWeatherInfo
import com.noreplypratap.weatherapplication.models.WeatherDetails

class DayDetailsAdapter(private var itemList: MutableList<DayDetails>) :
    RecyclerView.Adapter<DayDetailsAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvDay: TextView = itemView.findViewById(R.id.tvDay)
        var tvMinMaxTemp: TextView = itemView.findViewById(R.id.tvMinMaxTemp)
        var tvDesc: TextView = itemView.findViewById(R.id.tvDesc)
        var ivDdIcon: ImageView = itemView.findViewById(R.id.ivDdIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.days_details_item, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = itemList[position]

        holder.itemView.apply {
            holder.tvDay.text = data.day
            holder.tvDesc.text = data.desc
            holder.tvMinMaxTemp.text = data.minMaxTemp
            holder.ivDdIcon.setImageResource(data.icon)
        }
    }
}