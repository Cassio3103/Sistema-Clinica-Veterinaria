package com.SistemaClinicaVet.clinica_vet.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PacienteResponseDTO {

    private int paciente_id;
    private String nomePaciente;
    private LocalDate dataNascimentoPaciente;
    private double pesoPaciente;
    private char sexoPaciente;
    private String especie;
    private String raca;
    private boolean possuiProblemaSaude;

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
