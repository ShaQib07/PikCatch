package com.shakib.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AlternativeSlugs(
    val de: String?,
    val en: String?,
    val es: String?,
    val fr: String?,
    @SerialName("it")
    val itl: String?,
    val ja: String?,
    val ko: String?,
    val pt: String?
)
