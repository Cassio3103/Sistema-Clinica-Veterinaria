package com.SistemaClinicaVet.clinica_vet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

@Getter
@Entity
public abstract class Cargo {

    @Id
    @GeneratedValue
    private int idCargo;
    private String nomeCargo;
    @Setter
    private double salarioBase;
    @Setter
    private int horasTrabalhadas;

    public void setNomeCargo(@NonNull String nomeCargo){
        switch (nomeCargo){
            case "Veterinário":
            case "veterinário":
            case "Tosador":
            case "tosador":
            case "Atendente":
            case "atendente":
            case "Veterinario":
            case "veterinario":
                this.nomeCargo = nomeCargo;
                    break;
            default:
                throw new IllegalArgumentException("Cargo não definido!");
        }
    }

}
