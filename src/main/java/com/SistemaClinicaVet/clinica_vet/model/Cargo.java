package com.SistemaClinicaVet.clinica_vet.model;

public enum Cargo {

    VETERINARIO("Médico veterinário"),
    TOSADOR("Tosador"),
    ATENDENTE("Atendente");

    private final String nome;

    Cargo(String nome){
        this.nome = nome;
    }

    public String getNome(){return nome;}

    /*
    *  -> IMPLEMENTAR MÉTODOS HÍBRIDOS DENTRO DESSA CLASSE PARA:
    *  1. SALÁRIO BASE DOS CARGOS.
    *  2. BONUS.
    *
    * -> O VETERINÁRIO É OBRIGADO A REALIZAR PLANTÕES.
    * -> O ATENDENTE É OPCIONAL CASO HAJA ANIMAIS INTERNADOS.
    * */

}
