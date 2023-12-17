package com.massive_project_eduvion_dosen.network

import com.massive_project_eduvion_mahasiswa.onboarding.LoginActivity
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://192.168.1.9:8080/api/"
    private  lateinit var apiService: ApiService

    val token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NTdiMDg1MDZmNmM2ZjBkYzIwMzYwN2IiLCJpYXQiOjE3MDI1NjE5MDQsImV4cCI6MTcwMjgyMTEwNH0.Bxqd30C7YvoE3zulVfP7eUm6UJ07Kqbl_ThWQRr89Gg"
    val client = OkHttpClient.Builder().apply {
        addInterceptor{chain ->
            val request = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer $token")
                .build()
            chain.proceed(request)
        }

    }.build()
    fun getApi(): ApiService{
        if(!::apiService.isInitialized) {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()

           apiService = retrofit.create(ApiService::class.java)
        }
        return  apiService
    }


}

