package com.tavares.gerenciamentofinancas.services;

import com.tavares.gerenciamentofinancas.models.Financas;
import com.tavares.gerenciamentofinancas.repositories.FinancasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancasService {
    @Autowired
    private FinancasRepository repository;

    public Financas salvar(Financas financas){
        return repository.save(financas);
    }

    public List<Financas> listarTodos(){
        return repository.findAll();
    }

    public Optional<Financas> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
