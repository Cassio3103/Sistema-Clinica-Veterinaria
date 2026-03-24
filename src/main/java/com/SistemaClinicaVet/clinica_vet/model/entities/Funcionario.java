package com.SistemaClinicaVet.clinica_vet.model.entities;

import com.SistemaClinicaVet.clinica_vet.model.Cargo;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Funcionario extends Cargo {

    private int id_funcionario;
    private String nomeFuncinonario;
    @ManyToOne
    private Cargo cargoFuncionario;
    private int telefoneFuncionario;
    private String emailFuncionario;



}
