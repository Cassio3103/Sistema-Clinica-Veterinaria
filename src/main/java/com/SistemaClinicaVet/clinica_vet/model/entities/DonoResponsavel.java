package com.SistemaClinicaVet.clinica_vet.model.entities;

import com.SistemaClinicaVet.clinica_vet.model.Endereco;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class DonoResponsavel {

    private int dono_id;
    private String nomeDono;
    @Setter
    private int numeroDono;
    @Setter
    private String emailDono;
    @Setter
    private Endereco endereco;

    public DonoResponsavel(){}

    public DonoResponsavel(int dono_id, String nomeDono, int numeroDono, String emailDono) {
        this.dono_id = dono_id;
        this.nomeDono = nomeDono;
        this.numeroDono = numeroDono;
        this.emailDono = emailDono;
    }

}
