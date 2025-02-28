package com.example.flowershop.data.remote

import com.example.flowershop.data.remote.dto.VacancyListDto
import retrofit2.http.GET

interface SomeApi {

    @GET("vacancies.json")
    suspend fun getVacancies(): VacancyListDto

    companion object {
        const val BASE_URL = "https://klyushkin17.github.io/hh-api/"
    }
}