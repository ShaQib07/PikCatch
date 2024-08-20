package com.shakib.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    val download: String?,
    @SerialName("download_location")
    val downloadLocation: String?,
    val html: String?,
    val self: String?
)
