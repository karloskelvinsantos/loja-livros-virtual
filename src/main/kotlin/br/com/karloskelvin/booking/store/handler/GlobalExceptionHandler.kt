package br.com.karloskelvin.booking.store.handler

import br.com.karloskelvin.booking.store.dto.ApiError
import jakarta.validation.ConstraintViolationException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException::class)
    fun handleViolationException(
        exception: ConstraintViolationException
    ) : ResponseEntity<ApiError> {
        val errors = exception.constraintViolations.map { violation ->
            "${violation.propertyPath}: ${violation.message}"
        }

        val apiError = ApiError(
            code = HttpStatus.BAD_REQUEST.value(),
            status = HttpStatus.BAD_REQUEST,
            message = "Request com dados inválidos",
            errors = errors
        )

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError)
    }
}