package com.example.movieapp.network

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ImageService {
    @Multipart
    @POST("http://51.195.19.222/users/MORTEZA")
    fun uploadImage(
        @Part image: MultipartBody.Part,
    ): Call<Any>
}