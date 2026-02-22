package br.com.karloskelvin.booking.store.dto

import br.com.karloskelvin.booking.store.model.Autor

data class AutorRequest(
    val nome: String,
    val email: String,
    val descricao: String
) {
    fun toModel() : Autor {
        return Autor(nome = this.nome, email = this.email, descricao = this.descricao)
    }
}
