package com.noreplypratap.weatherapplication.ui.fragments

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.noreplypratap.weatherapplication.R
import com.noreplypratap.weatherapplication.databinding.FragmentWeatherBinding
import com.noreplypratap.weatherapplication.models.DayDetails
import com.noreplypratap.weatherapplication.models.TodaysWeatherInfo
import com.noreplypratap.weatherapplication.models.WeatherDetails
import com.noreplypratap.weatherapplication.ui.adapters.DayDetailsAdapter
import com.noreplypratap.weatherapplication.ui.adapters.TodaysWeatherInfoAdapter
import com.noreplypratap.weatherapplication.ui.adapters.WeatherDetailsAdapter
import com.noreplypratap.weatherapplication.utils.showToast
import com.noreplypratap.weatherapplication.viewmodels.WeatherViewModel


class WeatherFragment : Fragment(R.layout.fragment_weather) {

    private val viewModel: WeatherViewModel by viewModels()

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWeatherBinding.bind(view)
        setHasOptionsMenu(true)

        setupTodaysWeatherInfo()

        setupWeatherDetails()

        setupDayDetails()

        setupDayInfoCard()

    }

    private fun setupDayInfoCard() {
        val dayInfo = viewModel.getDayInfo()
        val sunsetIconId = requireActivity().findViewById<ImageView>(R.id.ivIconSunset)
        val sunriseIconId = requireActivity().findViewById<ImageView>(R.id.ivIconSunrise)
        val sunriseTimeId = requireActivity().findViewById<TextView>(R.id.tvSunriseTime)
        val sunsetTimeId = requireActivity().findViewById<TextView>(R.id.tvSunsetTime)
        sunriseTimeId.text = dayInfo.sunriseTime
        sunsetTimeId.text = dayInfo.sunsetTime
        sunriseIconId.setImageResource(dayInfo.sunriseIcon)
        sunsetIconId.setImageResource(dayInfo.sunsetIcon)
    }

    private fun setupTodaysWeatherInfo() {
        val todaysWeatherInfo = viewModel.getTodaysWeatherInfo()
        val dataAdapter =
            TodaysWeatherInfoAdapter(todaysWeatherInfo as MutableList<TodaysWeatherInfo>)
        binding?.rvTodaysWeatherInfo?.adapter = dataAdapter
    }

    private fun setupWeatherDetails() {
        val weatherDetails = viewModel.getWeatherDetails()
        val wdAdapter = WeatherDetailsAdapter(weatherDetails as MutableList<WeatherDetails>)
        binding?.rvWeatherDetails?.adapter = wdAdapter
    }

    private fun setupDayDetails() {
        val dayDetails = viewModel.getDayDetails()
        val dayDetailsAdapter = DayDetailsAdapter(dayDetails as MutableList<DayDetails>)
        val rvDayDetails = requireActivity().findViewById<RecyclerView>(R.id.rvDayDetails)
        rvDayDetails.adapter = dayDetailsAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater){
        inflater.inflate(R.menu.menu_main, menu)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                requireContext().showToast("TODO !!!")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
