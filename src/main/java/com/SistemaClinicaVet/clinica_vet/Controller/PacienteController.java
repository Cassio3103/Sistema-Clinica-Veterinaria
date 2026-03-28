package com.SistemaClinicaVet.clinica_vet.Controller;

import com.SistemaClinicaVet.clinica_vet.dto.PacienteRequestDTO;
import com.SistemaClinicaVet.clinica_vet.dto.PacienteResponseDTO;
import com.SistemaClinicaVet.clinica_vet.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<PacienteResponseDTO> cadastrarPaciente(@RequestBody PacienteRequestDTO pacienteRequestDTO){
        return ResponseEntity.ok().body(pacienteService.cadastrarPaciente(pacienteRequestDTO));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<PacienteResponseDTO> buscarPaciente(@PathVariable int id, @RequestBody PacienteRequestDTO pacienteRequestDTO){
        return ResponseEntity.ok().body(pacienteService.buscarPaciente(id, pacienteRequestDTO));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<PacienteResponseDTO> atualizarPaciente(@PathVariable int id, @RequestBody PacienteRequestDTO pacienteRequestDTO){
        return ResponseEntity.ok().body(pacienteService.atualizarPaciente(id, pacienteRequestDTO));
    }

    //@DeleteMapping("/deletar/{id}")


}
