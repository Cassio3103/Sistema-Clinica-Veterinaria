package com.SistemaClinicaVet.clinica_vet.dto;

import com.SistemaClinicaVet.clinica_vet.model.Cargo;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class FuncionarioRequestDTO {

    private int funcionario_id;
    private String nomeFuncionario;
    Cargo cargo;
    int telefoneFuncionario;
    String emailFuncionario;
}
