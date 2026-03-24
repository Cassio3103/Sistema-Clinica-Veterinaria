package com.SistemaClinicaVet.clinica_vet.dto;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Getter
@RequestMapping
public class PacienteRequestDTO {

    private int paciente_id;
    private String nomePaciente;
    private LocalDate dataNascimentoPaciente;
    private double pesoPaciente;
    private char sexoPaciente;
    private String especie;
    private String raca;
    private boolean possuiProblemaSaude;

    public PacienteRequestDTO(int paciente_id, String nomePaciente, LocalDate dataNascimentoPaciente, double pesoPaciente,
                              char sexoPaciente, String especie, String raca, boolean possuiProblemaSaude){
        this.paciente_id = paciente_id;
        this.nomePaciente = nomePaciente;
        this.dataNascimentoPaciente = dataNascimentoPaciente;
        this.pesoPaciente = pesoPaciente;
        this.sexoPaciente = sexoPaciente;
        this.especie = especie;
        this.raca = raca;
        this.possuiProblemaSaude = possuiProblemaSaude;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setPesoPaciente(double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }


    public void setPossuiProblemaSaude(boolean possuiProblemaSaude) {
        this.possuiProblemaSaude = possuiProblemaSaude;
    }
}
