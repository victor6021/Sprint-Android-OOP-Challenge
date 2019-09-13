package com.example.sprintandroidoopchallenge.api

import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AoETwoAPI {

    @GET("civilizations")
    fun getCivil(): Call<List<AgeOfEmpiresTwo>>

    @GET("civilization/{id}")
    fun getCivil(@Path("id") id: String): Call<AgeOfEmpiresTwo>

    @GET("units")
    fun getUnit(): Call<List<AgeOfEmpiresTwo>>

    @GET("unit/{id}")
    fun getUnit(@Path("id") id: String): Call<AgeOfEmpiresTwo>

    @GET("structures")
    fun getStructure(): Call<List<AgeOfEmpiresTwo>>

    @GET("structure/{id}")
    fun getStructure(@Path("id") id: String): Call<AgeOfEmpiresTwo>

    @GET("technologies")
    fun getTech(): Call<List<AgeOfEmpiresTwo>>

    @GET("Technology/{id}")
    fun getTech(@Path("id") id: String): Call<AgeOfEmpiresTwo>
}