package br.com.karloskelvin.booking.store

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class LojaLivrosVirtualApplication

fun main(args: Array<String>) {
	runApplication<LojaLivrosVirtualApplication>(*args)
}
