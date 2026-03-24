package com.SistemaClinicaVet.clinica_vet.Repository;

import com.SistemaClinicaVet.clinica_vet.model.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    private boolean existsByid(int id) {
        return true;
    }

      Optional<Paciente> findById(int id);

    boolean existsById();
}
