package com.massive_project_eduvion_dosen.network

import com.massive_project_eduvion_dosen.models.LoginRequest
import com.massive_project_eduvion_dosen.models.LoginResponse
import com.massive_project_eduvion_mahasiswa.models.DissertationsRequest
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponse
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponseItem
import com.massive_project_eduvion_mahasiswa.models.DosenResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @POST("dosen/login") // Ganti dengan endpoint yang benar
    fun login(@Body request: LoginRequest):retrofit2.Call<LoginResponse>

    @GET("dissertations") // Ganti dengan endpoint yang benar
    fun getAllDissertation(): retrofit2.Call<List<DissertationsResponseItem>>

    @POST("dissertations") // Ganti dengan endpoint yang benar
    fun createDissertations(@Body request: DissertationsRequest):retrofit2.Call<DissertationsResponse>
    @GET("dosen") // Ganti dengan endpoint yang benar
    fun getAllDosen():retrofit2.Call<DosenResponse>
}
