package com.SistemaClinicaVet.clinica_vet.Exception;

public class PacienteInexistenteException extends RuntimeException {
    public PacienteInexistenteException(String message) {
        super(message);
    }
}
