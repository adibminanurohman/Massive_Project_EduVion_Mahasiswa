package com.massive_project_eduvion_dosen.network

import android.text.Editable
import com.massive_project_eduvion_dosen.models.LoginRequest
import com.massive_project_eduvion_dosen.models.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("dosen/login") // Ganti dengan endpoint yang benar
    fun login(@Body request: LoginRequest):retrofit2.Call<LoginResponse>
}
