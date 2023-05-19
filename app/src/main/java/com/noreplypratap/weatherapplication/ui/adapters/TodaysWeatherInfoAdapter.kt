package com.noreplypratap.weatherapplication.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.noreplypratap.weatherapplication.R
import com.noreplypratap.weatherapplication.models.TodaysWeatherInfo

class TodaysWeatherInfoAdapter(private var itemList : MutableList<TodaysWeatherInfo>) : RecyclerView.Adapter<TodaysWeatherInfoAdapter.ViewHolder>()  {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var tvTime: TextView = itemView.findViewById(R.id.tvTime)
        var ivIcon: ImageView = itemView.findViewById(R.id.ivIcon)
        var tvTemp: TextView = itemView.findViewById(R.id.tvTemp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.small_cards_details,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data  = itemList[position]

        holder.itemView.apply {
            holder.tvTime.text = data.time
            holder.tvTemp.text = data.temp
            holder.ivIcon.setImageResource(data.icon)
        }
    }
}