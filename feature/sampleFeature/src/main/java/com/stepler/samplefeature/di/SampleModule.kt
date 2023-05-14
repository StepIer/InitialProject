package com.stepler.samplefeature.di

import com.stepler.samplefeature.data.SampleRepositoryImpl
import com.stepler.samplefeature.domain.SampleRepository
import com.stepler.samplefeature.domain.SampleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object SampleModule {

    @Provides
    fun provideSampleRepository(): SampleRepository {
        return SampleRepositoryImpl()
    }

    @Provides
    fun provideSampleUseCase(
        sampleRepository: SampleRepository
    ): SampleUseCase {
        return SampleUseCase(sampleRepository)
    }
}