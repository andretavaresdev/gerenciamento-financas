package com.tavares.gerenciamentofinancas.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="tb_financas")
public class Financas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="operfin")
    private String operacaoFinanceira;

    @Column(name="data_movto")
    private LocalDate dataOperacao;

    private String descricao;

    public Financas(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperacaoFinanceira() {
        return operacaoFinanceira;
    }

    public void setOperacaoFinanceira(String operacaoFinanceira) {
        this.operacaoFinanceira = operacaoFinanceira;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
