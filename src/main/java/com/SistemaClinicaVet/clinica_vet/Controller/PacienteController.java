package com.SistemaClinicaVet.clinica_vet.Controller;

import com.SistemaClinicaVet.clinica_vet.dto.PacienteRequestDTO;
import com.SistemaClinicaVet.clinica_vet.dto.PacienteResponseDTO;
import com.SistemaClinicaVet.clinica_vet.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<PacienteResponseDTO> cadastrarPaciente(@RequestBody PacienteRequestDTO pacienteRequestDTO){
        return ResponseEntity.ok().body(pacienteService.cadastrarPaciente(pacienteRequestDTO));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<PacienteResponseDTO> atualizarPaciente(@PathVariable int id, @RequestBody PacienteRequestDTO pacienteRequestDTO){
        return ResponseEntity.ok().body(pacienteService.atualizarPaciente(id, pacienteRequestDTO));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<PacienteResponseDTO> buscarPaciente(@PathVariable int id){
        return ResponseEntity.ok(pacienteService.buscarPaciente(id));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarPaciente(@PathVariable int id){
        pacienteService.deletarPaciente(id);
        return ResponseEntity.noContent().build();
    }

}
