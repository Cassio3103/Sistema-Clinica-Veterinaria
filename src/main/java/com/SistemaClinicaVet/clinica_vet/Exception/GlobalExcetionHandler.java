package com.SistemaClinicaVet.clinica_vet.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExcetionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AgendamentoIndisponivelException.class)
    private ResponseEntity<RestErrorMessage> agendamentoIndisponivelHandler
            (AgendamentoIndisponivelException exception) {
        RestErrorMessage threatResponse = new RestErrorMessage(HttpStatus.CONFLICT,
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(threatResponse);
    }

    @ExceptionHandler(PacienteNaoEncontradoException.class)
    private ResponseEntity<RestErrorMessage> pacienteNaoEncontradorHandler
            (PacienteNaoEncontradoException exception) {
        RestErrorMessage threatResponse = new RestErrorMessage((HttpStatus.NOT_FOUND),
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(threatResponse);
    }

    @ExceptionHandler(PacienteDuplicadoException.class)
    private ResponseEntity<RestErrorMessage> pacienteDuplicadoHandler
            (PacienteDuplicadoException exception) {
        RestErrorMessage threatResponse = new RestErrorMessage((HttpStatus.CONFLICT),
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(threatResponse);
    }

    @ExceptionHandler(PacienteInexistenteException.class)
    private ResponseEntity<RestErrorMessage> pacienteInexistenteHandler
            (PacienteInexistenteException exception) {
        RestErrorMessage threatResponse = new RestErrorMessage((HttpStatus.CONFLICT),
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(threatResponse);
    }

}