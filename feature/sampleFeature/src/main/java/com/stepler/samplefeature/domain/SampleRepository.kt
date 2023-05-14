package com.stepler.samplefeature.domain

interface SampleRepository {

    suspend fun getHello(): String
}