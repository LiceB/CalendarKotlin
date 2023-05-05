package com.example.calendar

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Shedule(
    val data: Int,
    val shedule: String
) :Parcelable
