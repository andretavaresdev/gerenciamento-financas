package com.tavares.gerenciamentofinancas.controllers;

import com.tavares.gerenciamentofinancas.models.Financas;
import com.tavares.gerenciamentofinancas.services.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/financas")
public class FinancasController {
    @Autowired
    public FinancasService service;

    @PostMapping
    public ResponseEntity<Financas> salvar(@RequestBody Financas financas){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(financas));
    }

    @GetMapping
    public ResponseEntity<List<Financas>> listarTodos(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Financas> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
                .map(financas -> ResponseEntity.ok(financas))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
