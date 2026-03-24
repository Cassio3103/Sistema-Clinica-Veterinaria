package com.SistemaClinicaVet.clinica_vet.Repository;

import com.SistemaClinicaVet.clinica_vet.model.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {

    boolean existesByDataHora(LocalDateTime dataHora);
}
