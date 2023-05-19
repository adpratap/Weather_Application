package com.noreplypratap.weatherapplication.utils

import android.content.Context
import android.widget.Toast

fun Context.showToast(msg: String) {
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}

fun Context.showToastLong(msg: String) {
    Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
}