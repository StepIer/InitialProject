package com.stepler.samplefeature.data

import com.stepler.samplefeature.domain.SampleRepository

class SampleRepositoryImpl : SampleRepository {
    override suspend fun getHello(): String {
        return "Hello world"
    }
}