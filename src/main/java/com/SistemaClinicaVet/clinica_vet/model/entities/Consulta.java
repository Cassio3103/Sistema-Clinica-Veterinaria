package com.SistemaClinicaVet.clinica_vet.model.entities;

import jakarta.persistence.Id;

import java.util.Date;

public class Consulta {

    @Id
    private int consulta_id;
    private Agendamento agendamento;
    private Paciente paciente;
    private Funcionario medicoVeterinario;

    private Date dataConsulta;
    private String diagnostico;
    private String sintomas;
    private String tratamento;
}
