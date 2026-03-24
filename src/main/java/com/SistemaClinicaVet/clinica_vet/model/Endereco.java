package com.SistemaClinicaVet.clinica_vet.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Endereco {

    @Setter
    private String bairro;
    @Setter
    private String rua;
    @Setter
    private int numeroResidencia;
    private int cep;
    int quantidade = (int) Math.log10(Math.abs(cep)) + 1;

    //public Endereco(){}

    public Endereco(String bairro, String rua, int numeroResidencia, int cep){
        this.bairro = bairro;
        this.rua = rua;
        this.numeroResidencia = numeroResidencia;
        this.setCep(cep);
    }

    public void setCep(int cep) {
        if(quantidade != 8){
            throw new IllegalArgumentException("CEP inválido!");
        }
        else {
            this.cep = cep;
        }
    }

}
