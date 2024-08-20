package com.shakib.network

import com.shakib.model.UnsplashImage
import retrofit2.http.GET

interface UnsplashApi {
    @GET("photos/?client_id=35PBKqJfzO-Hsji3X7Y8eTuUl8SoluD9Rp-nRnedBCw")
    suspend fun getPhotos(): List<UnsplashImage>
}
