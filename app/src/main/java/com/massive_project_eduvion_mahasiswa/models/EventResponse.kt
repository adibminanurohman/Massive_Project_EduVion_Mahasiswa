package com.massive_project_eduvion_mahasiswa.models

import com.google.gson.annotations.SerializedName;
import java.util.Date

data class EventResponse(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("date")
    val date: Date? = null,

    @field:SerializedName("time")
    val time: String? = null,

    @field:SerializedName("location")
    val location: String? = null,

    @field:SerializedName("_id")
    val id: String? = null,

    @field:SerializedName("__v")
    val v: Int? = null,
)
