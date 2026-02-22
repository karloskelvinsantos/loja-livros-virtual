package br.com.karloskelvin.booking.store.repository

import br.com.karloskelvin.booking.store.model.Autor
import org.springframework.data.jpa.repository.JpaRepository

interface AutorRepository : JpaRepository<Autor, Long> {

}
