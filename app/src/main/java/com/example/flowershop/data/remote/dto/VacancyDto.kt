package com.example.flowershop.data.remote.dto

import com.squareup.moshi.Json

data class VacancyDto(
    @field:Json(name = "id") val vacancyId: String,
    @field:Json(name = "lookingNumber") val lookingNumber: Int,
)
