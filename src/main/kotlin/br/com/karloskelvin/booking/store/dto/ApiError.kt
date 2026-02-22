package br.com.karloskelvin.booking.store.dto

import org.springframework.http.HttpStatus

data class ApiError(
    val code: Int,
    val status: HttpStatus,
    val message: String?,
    val errors: List<String>?
)
