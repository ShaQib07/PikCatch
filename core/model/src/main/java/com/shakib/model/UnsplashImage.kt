package com.shakib.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UnsplashImage(
    val id: String,
    val slug: String?,
    @SerialName("alternative_slugs")
    val alternativeSlugs: AlternativeSlugs?,
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("updated_at")
    val updatedAt: String?,
    val width: Int?,
    val height: Int?,
    val color: String?,
    val description: String?,
    @SerialName("alt_description")
    val altDescription: String?,
    val urls: Urls?,
    val links: Links?,
    val likes: Int?
)
