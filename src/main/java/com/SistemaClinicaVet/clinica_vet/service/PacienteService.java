package com.SistemaClinicaVet.clinica_vet.service;

import com.SistemaClinicaVet.clinica_vet.service.MetodosAuxilixaresService;
import com.SistemaClinicaVet.clinica_vet.Exception.NoChangeException;
import com.SistemaClinicaVet.clinica_vet.Exception.PacienteInexistenteException;
import com.SistemaClinicaVet.clinica_vet.Exception.PacienteNaoEncontradoException;
import com.SistemaClinicaVet.clinica_vet.Repository.PacienteRepository;
import com.SistemaClinicaVet.clinica_vet.dto.PacienteRequestDTO;
import com.SistemaClinicaVet.clinica_vet.dto.PacienteResponseDTO;
import com.SistemaClinicaVet.clinica_vet.model.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;


@Service
public class PacienteService extends MetodosAuxilixaresService{

    @Autowired
    private PacienteRepository pacienteRepository;

    protected PacienteService(PacienteRepository pacienteRepository){
        super();
    }

    public PacienteResponseDTO cadastrarPaciente(PacienteRequestDTO dto){

        if(
                pacienteRepository.existsById(dto.getPaciente_id()))
            throw new IllegalArgumentException("Um paciente com esse ID já está cadastrado!");


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

        return new PacienteResponseDTO(
                paciente.getPaciente_id(),
                paciente.getNomePaciente(),
                paciente.getDataNascimentoPaciente(),
                paciente.getPesoPaciente(),
                paciente.getSexoPaciente(),
                paciente.getEspecie(),
                paciente.getRaca(),
                paciente.getPossuiProblemaSaude()
        );
    }

    public void pacienteMudanca(Paciente paciente, PacienteRequestDTO pacienteRequestDTO){
        boolean naoMudou =
            paciente.getNomePaciente().equals(pacienteRequestDTO.getNomePaciente())
                &&
            paciente.getPesoPaciente() == pacienteRequestDTO.getPesoPaciente()
                &&
            paciente.getPossuiProblemaSaude() == pacienteRequestDTO.possuiProblemaSaude();

        if(naoMudou){
            throw new NoChangeException("Não há mudanças!");
        }
    }

    public PacienteResponseDTO atualizarPaciente(int paciente_id, PacienteRequestDTO dto){

        Paciente paciente = verificarPaciente(paciente_id);
        pacienteMudanca(paciente, dto);

        paciente.setNomePaciente(dto.getNomePaciente());
        paciente.setPesoPaciente(dto.getPesoPaciente());
        paciente.setPossuiProblemaSaude(dto.possuiProblemaSaude());

        pacienteRepository.save(paciente);

        return new PacienteResponseDTO(
                paciente.getPaciente_id(),
                paciente.getNomePaciente(),
                paciente.getDataNascimentoPaciente(),
                paciente.getPesoPaciente(),
                paciente.getSexoPaciente(),
                paciente.getEspecie(),
                paciente.getRaca(),
                paciente.getPossuiProblemaSaude()
        );
    }

    public PacienteResponseDTO buscarPaciente(int paciente_id, PacienteRequestDTO pacienteRequestDTO){

        Paciente paciente = verificarPaciente(paciente_id);

        return new PacienteResponseDTO(
                paciente.getPaciente_id(),
                paciente.getNomePaciente(),
                paciente.getDataNascimentoPaciente(),
                paciente.getPesoPaciente(),
                paciente.getSexoPaciente(),
                paciente.getEspecie(),
                paciente.getRaca(),
                paciente.getPossuiProblemaSaude()
        );
    }

}
