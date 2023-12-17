package com.massive_project_eduvion_mahasiswa.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DissertationsRequest {
    @SerializedName("npm")
    @Expose
    var npm: String? = null


    @SerializedName("name")
    @Expose
    var name: String? = null


    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("chapter")
    @Expose
    var chapter: String? = null

    @SerializedName("supervisor")
    @Expose
    var supervisor: String? = null
}