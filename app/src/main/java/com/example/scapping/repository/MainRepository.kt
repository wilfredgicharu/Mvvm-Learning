package com.example.scapping.repository

import com.example.scapping.Retrofit.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getAllMovies() = retrofitService.getAllMovies()
}