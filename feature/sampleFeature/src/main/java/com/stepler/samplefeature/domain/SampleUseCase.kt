package com.stepler.samplefeature.domain

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SampleUseCase(
    private val sampleRepository: SampleRepository,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend fun invoke(): String = withContext(dispatcher) {
        return@withContext sampleRepository.getHello()
    }
}