package com.SistemaClinicaVet.clinica_vet.service;

import com.SistemaClinicaVet.clinica_vet.Repository.PacienteRepository;

public abstract class PacienteCadastradoService {

    private final PacienteRepository pacienteRepository;
    protected PacienteCadastradoService(PacienteRepository pacienteRepository){this.pacienteRepository =
    pacienteRepository;}

}
