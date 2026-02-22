package br.com.karloskelvin.booking.store.controller

import br.com.karloskelvin.booking.store.dto.AutorRequest
import br.com.karloskelvin.booking.store.dto.AutorResponse
import br.com.karloskelvin.booking.store.service.AutorService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/autor")
data class AutorController(
    val autorService: AutorService
) {

    @PostMapping
    fun cadastrar(@RequestBody autorRequest: AutorRequest): ResponseEntity<AutorResponse> {
        return ResponseEntity.status(201).body(autorService.cadastrar(autorRequest))
    }

}