package com.example.flowershop.data.remote.dto

import com.squareup.moshi.Json

data class VacancyListDto(
    @field:Json(name = "vacancies") val vacancyList: List<VacancyDto>,
)
