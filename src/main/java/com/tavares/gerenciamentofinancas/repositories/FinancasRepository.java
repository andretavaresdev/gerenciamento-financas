package com.tavares.gerenciamentofinancas.repositories;

import com.tavares.gerenciamentofinancas.models.Financas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancasRepository extends JpaRepository<Financas, Long> {}
