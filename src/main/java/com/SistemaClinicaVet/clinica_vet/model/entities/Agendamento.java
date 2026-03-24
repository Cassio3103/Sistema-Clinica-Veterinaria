package com.SistemaClinicaVet.clinica_vet.model.entities;

import com.SistemaClinicaVet.clinica_vet.Repository.ServicoRepository;
import com.SistemaClinicaVet.clinica_vet.model.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Agendamento implements ServicoRepository {

    @Id
    private int agendamento_id;
    @Setter
    private Paciente paciente_id;
    @ManyToOne
    private Funcionario funcionario_id;

    private Date dataAgendamento;
    private LocalDate horariosAgendamentos;
    @Setter
    private ServicoRepository tipoServico;
    @Setter
    private Status statusAgendamento;

    private LocalDateTime DataHora;

    public Agendamento(int agendamento_id, Date dataAgendamento, LocalDate horariosAgendamento,
                       ServicoRepository tipoServico, Status statusAgendamento){
        this.agendamento_id = agendamento_id;
        this.dataAgendamento = dataAgendamento;
        this.horariosAgendamentos = horariosAgendamento;
        this.tipoServico = tipoServico;
        this.statusAgendamento = statusAgendamento;
    }



}
