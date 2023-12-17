package com.massive_project_eduvion_mahasiswa.models

import com.google.gson.annotations.SerializedName

data class DissertationsResponse(

	@field:SerializedName("DissertationsResponse")
	val dissertationsResponse: List<DissertationsResponseItem?>? = null
)

data class DissertationsResponseItem(

	@field:SerializedName("chapter")
	val chapter: String? = null,

	@field:SerializedName("__v")
	val v: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("npm")
	val npm: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("supervisor")
	val supervisor: String? = null
)
