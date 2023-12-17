package com.massive_project_eduvion_mahasiswa.models

import com.google.gson.annotations.SerializedName

data class DosenResponse(

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("nip")
	val nip: String? = null,

	@field:SerializedName("joined")
	val joined: String? = null,

	@field:SerializedName("__v")
	val v: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)
