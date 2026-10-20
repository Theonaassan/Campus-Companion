package com.inci.campuscompanion.data.remote

import com.google.gson.annotations.SerializedName

data class EventDto(
    @SerializedName("id") val id: String?,
    @SerializedName("title") val title: String?,
    @SerializedName("date") val date: String?,
    @SerializedName("location") val location: String?,
    @SerializedName("description") val description: String?
)
