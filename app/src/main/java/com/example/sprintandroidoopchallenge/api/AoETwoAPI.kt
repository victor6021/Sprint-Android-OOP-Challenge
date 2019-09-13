package com.example.sprintandroidoopchallenge.api

import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AoETwoAPI {

    @GET("civilization/{id}")
    fun getCivil(@Path("id") id: String): Call<AgeOfEmpiresTwo>
}