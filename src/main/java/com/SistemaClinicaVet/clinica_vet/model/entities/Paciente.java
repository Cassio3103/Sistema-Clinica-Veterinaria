package com.SistemaClinicaVet.clinica_vet.model.entities;

import com.SistemaClinicaVet.clinica_vet.dto.PacienteRequestDTO;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {

    private int paciente_id;
    private String nomePaciente;
    private LocalDate dataNascimentoPaciente;
    private double pesoPaciente;
    private char sexoPaciente;
    private String especie;
    private String raca;
    private boolean possuiProblemaSaude;

    public Paciente(){}

    public Paciente(int paciente_id, String nomePaciente, LocalDate dataNascimentoPaciente, double pesoPaciente
    , char sexoPaciente, String especie, String raca, boolean possuiProblemaSaude){
        this.paciente_id = paciente_id;
        this.nomePaciente = nomePaciente;
        this.dataNascimentoPaciente = dataNascimentoPaciente;
        this.pesoPaciente = pesoPaciente;
        this.sexoPaciente = sexoPaciente;
        this.especie = especie;
        this.raca = raca;
        this.possuiProblemaSaude = false;
    }

    public LocalDate getDataNascimentoPaciente() {
        return null;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public double getPesoPaciente() {
        return pesoPaciente;
    }

    public char getSexoPaciente() {
        return sexoPaciente;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public boolean isPossuiProblemaSaude() {
        return possuiProblemaSaude;
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

    public void setDataNascimentoPaciente(LocalDate dataNascimentoPaciente) {
    }

    public void setIdadePaciente(int idade) {
    }

}
