package com.SistemaClinicaVet.clinica_vet.service;

import com.SistemaClinicaVet.clinica_vet.Exception.PacienteNaoEncontradoException;
import com.SistemaClinicaVet.clinica_vet.Repository.PacienteRepository;
import com.SistemaClinicaVet.clinica_vet.model.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class MetodosAuxilixaresService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente verificarPaciente(int paciente_id){
        return pacienteRepository.findById(paciente_id)
                .orElseThrow(() -> new PacienteNaoEncontradoException("Paciente não encontrado!"));
    }



}
