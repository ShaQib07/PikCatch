package com.shakib.data

import com.shakib.network.UnsplashApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PhotoRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
    suspend fun getPhotos() = withContext(Dispatchers.IO) { unsplashApi.getPhotos() }
}
