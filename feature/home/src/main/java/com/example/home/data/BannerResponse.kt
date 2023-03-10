package com.example.home.data

import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


@Serializable
data class BannerResponse(
    @SerialName("data")
    val `data`: List<Data?>? = null,
    @SerialName("errorCode")
    val errorCode: Int? = null,
    @SerialName("errorMsg")
    val errorMsg: String? = null
)

@Serializable
data class Data(
    @SerialName("desc")
    val desc: String? = null,
    @SerialName("id")
    val id: Int? = null,
    @SerialName("imagePath")
    val imagePath: String? = null,
    @SerialName("isVisible")
    val isVisible: Int? = null,
    @SerialName("order")
    val order: Int? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("type")
    val type: Int? = null,
    @SerialName("url")
    val url: String? = null
)