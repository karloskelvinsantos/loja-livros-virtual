package br.com.karloskelvin.booking.store.model

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
class BaseEntity {

    @field:Column(nullable = false, updatable = false)
    @field:CreatedDate
    private var dataCadastro: Instant? = null

    fun getDataCadastro() : Instant? {
        return this.dataCadastro
    }
}