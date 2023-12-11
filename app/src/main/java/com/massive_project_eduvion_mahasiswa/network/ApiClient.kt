package com.massive_project_eduvion_dosen.network

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://192.168.1.3:8080/api/"
    private  lateinit var apiService: ApiService

    fun getApi(context: Context): ApiService{
        if(!::apiService.isInitialized) {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

           apiService = retrofit.create(ApiService::class.java)
        }
        return  apiService
    }


}

