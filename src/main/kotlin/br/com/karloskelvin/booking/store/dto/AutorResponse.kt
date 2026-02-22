package br.com.karloskelvin.booking.store.dto

import java.time.Instant

data class AutorResponse(
    val id: Long? = null,
    val nome: String,
    val email: String,
    val descricao: String,
    val dataCadastro: Instant? = null
) {
}
