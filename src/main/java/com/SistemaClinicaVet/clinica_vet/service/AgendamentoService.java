package com.SistemaClinicaVet.clinica_vet.service;

import com.SistemaClinicaVet.clinica_vet.Exception.AgendamentoIndisponivelException;
import com.SistemaClinicaVet.clinica_vet.Repository.AgendamentoRepository;

import com.SistemaClinicaVet.clinica_vet.model.entities.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento criarAgenamento(Agendamento agendamento){
        if(agendamento.getDataHora().isBefore(LocalDateTime.now())){
            throw new AgendamentoIndisponivelException("Data inválida: Está no passado!");
        }
        return agendamentoRepository.save(agendamento);
    }

}
