package com.SistemaClinicaVet.clinica_vet.model;

public enum StatusAgendamento {

    Marcado("Agendamento marcado"),
    EmOperacao("Serviço em operação"),
    Finalizado("Serviço finalizado");


    private final String nome;
    public String getNome(){return nome;}

    StatusAgendamento(String nome){this.nome = nome;}

}
