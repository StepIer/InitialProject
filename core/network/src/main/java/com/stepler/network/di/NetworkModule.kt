package com.stepler.network.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.stepler.network.data.PublicApisService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.create

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    @Singleton
    fun provideApiInfoRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .baseUrl("https://api.publicapis.org")
            .build()
    }

    @Provides
    @Singleton
    fun providePublicApisService(retrofit: Retrofit): PublicApisService {
        return retrofit.create()
    }
}