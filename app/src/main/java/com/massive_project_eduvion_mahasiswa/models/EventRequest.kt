package com.massive_project_eduvion_mahasiswa.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.Date

class EventRequest {

    @SerializedName("name")
    @Expose
    var name: String? = null


    @SerializedName("date")
    @Expose
    var date: Date? = null

    @SerializedName("time")
    @Expose
    var time: String? = null

    @SerializedName("location")
    @Expose
    var location: String? = null
}