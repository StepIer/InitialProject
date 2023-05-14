package com.stepler.network.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListApiWithSize(
    @SerialName("count")
    val count: Int,
    @SerialName("entries")
    val entries: List<ApiInfo>,
)