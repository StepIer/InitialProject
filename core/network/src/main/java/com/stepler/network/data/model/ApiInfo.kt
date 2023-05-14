package com.stepler.network.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiInfo(
    @SerialName("API")
    val api: String,
    @SerialName("Description")
    val description: String,
    @SerialName("Auth")
    val auth: String?,
    @SerialName("HTTPS")
    val https: Boolean,
    @SerialName("Cors")
    val cors: String,
    @SerialName("Link")
    val link: String,
    @SerialName("Category")
    val category: String,
)