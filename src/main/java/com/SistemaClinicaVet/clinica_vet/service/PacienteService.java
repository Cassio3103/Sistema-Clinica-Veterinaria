package com.SistemaClinicaVet.clinica_vet.service;

import com.SistemaClinicaVet.clinica_vet.Repository.PacienteRepository;
import com.SistemaClinicaVet.clinica_vet.dto.PacienteRequestDTO;
import com.SistemaClinicaVet.clinica_vet.dto.PacienteResponseDTO;
import com.SistemaClinicaVet.clinica_vet.model.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;


@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    protected PacienteService(PacienteRepository pacienteRepository){
        super();
    }

    public PacienteResponseDTO cadastrarPaciente(PacienteRequestDTO dto){

        if(dto.getPesoPaciente() <= 0){
            throw new IllegalArgumentException("Peso inválido!");
        }

        if(dto.getDataNascimentoPaciente() == null ||
                dto.getDataNascimentoPaciente().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida!");
        }
        int idade = Period.between(dto.getDataNascimentoPaciente(), LocalDate.now()).getYears();

        Paciente paciente = new Paciente();
        paciente.setNomePaciente(dto.getNomePaciente());
        paciente.setPesoPaciente(dto.getPesoPaciente());
        paciente.setDataNascimentoPaciente(dto.getDataNascimentoPaciente());
        paciente.setIdadePaciente(idade);

        paciente = pacienteRepository.save(paciente);

//        return new PacienteResponseDTO(
//                paciente.getPaciente_id(),
//                paciente.getNomePaciente(),
//                paciente.getPesoPaciente(),
//                paciente.getDataNascimentoPaciente(),
//                paciente.getEspecie(),
//                paciente.getSexoPaciente()
        //);
    }


}
