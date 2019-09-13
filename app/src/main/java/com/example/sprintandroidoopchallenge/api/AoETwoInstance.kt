package com.example.sprintandroidoopchallenge.api

import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AoETwoInstance {
    private const val BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/"

    private val gson = GsonBuilder()
        .setLenient()
        .create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun getAoETwo(id: String): Call<AgeOfEmpiresTwo>{
        return retrofit.create(AoETwoAPI::class.java).getCivil(id)
    }
}