package com.SistemaClinicaVet.clinica_vet.model;

import lombok.Getter;

public class Status {

    @Getter
    private String nomeStatus;

    public Status(String nomeStatus){
        this.setNomeStatus(nomeStatus);
    }

    public void setNomeStatus(String nomeStatus) {
        if(nomeStatus.equals("Marcado") || nomeStatus.equals("Em operação") || nomeStatus.equals("Finalizado")) {
            this.nomeStatus = nomeStatus;
        } else {
            throw new IllegalArgumentException("Status de operação inválido!");
        }
    }


}
