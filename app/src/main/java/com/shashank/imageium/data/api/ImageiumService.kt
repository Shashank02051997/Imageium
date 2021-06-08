package com.shashank.imageium.data.api

import com.shashank.imageium.model.Post
import retrofit2.Response
import retrofit2.http.GET

/**
 * Service to fetch Images posts using dummy end point [PICSUM_API_URL].
 */
interface ImageiumService {

    @GET("list?page=1")
    suspend fun getPosts(): Response<List<Post>>

    companion object {
        const val IMAGEIUM_API_URL = "https://picsum.photos/v2/"
    }
}
