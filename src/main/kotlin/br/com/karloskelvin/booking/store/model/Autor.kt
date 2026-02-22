package br.com.karloskelvin.booking.store.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

@Entity
class Autor (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,
    @field:NotNull(message = "Campo nome é obrigatório")
    private var nome: String,
    @field:NotNull(message = "Campo email é obrigatório")
    @field:Email(message = "Campo email deve conter um valor válido")
    private var email: String,
    @field:NotNull(message = "Campo descrição é obrigatório")
    @field:Size(message = "Campo descrição deve conter no máximo 400 caracteres",max = 400)
    private var descricao: String
) : BaseEntity() {

    fun getId() : Long? {
        return this.id
    }

    fun getNome() : String {
        return this.nome
    }

    fun getEmail() : String {
        return this.email
    }

    fun getDescricao() : String {
        return this.descricao
    }
}