package com.example.whatnow

import retrofit2.Call
import retrofit2.http.GET

interface NewsCallable {

    @GET ("/v2/top-headlines?country=us&category=general&apiKey=ce57876b59164b9eaf1392c14c4bf330&pageSize=30")

    fun getNews(): Call<News>
}