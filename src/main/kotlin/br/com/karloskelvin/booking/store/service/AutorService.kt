package br.com.karloskelvin.booking.store.service

import br.com.karloskelvin.booking.store.dto.AutorRequest
import br.com.karloskelvin.booking.store.dto.AutorResponse
import br.com.karloskelvin.booking.store.repository.AutorRepository
import org.springframework.stereotype.Service

@Service
class AutorService(
    private val autorRepository: AutorRepository
) {

    fun cadastrar(autor: AutorRequest): AutorResponse? {
        val autorModel = autor.toModel()
        autorRepository.save(autorModel)

        return AutorResponse(
            autorModel.getId(),
            autorModel.getNome(),
            autorModel.getEmail(),
            autorModel.getDescricao(),
            autorModel.getDataCadastro()
        )
    }

}
