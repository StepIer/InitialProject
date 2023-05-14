package com.stepler.network.data

import com.stepler.network.data.model.ListApiWithSize
import retrofit2.Call
import retrofit2.http.GET

interface PublicApisService {
    @GET("entries")
    fun getListApiInfo(): Call<ListApiWithSize>
}