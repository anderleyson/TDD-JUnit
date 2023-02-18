package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {

    A_DESEJAR("Desempenho a desejar", new BigDecimal("0.03")),
    BOM("Bom desempenho", new BigDecimal("0.10")),
    OTIMO("Ótimo desempenho", new BigDecimal("0.15"));

    private String nome;
    private BigDecimal porcentagemReajuste;

    Desempenho(String nome, BigDecimal porcentagemReajuste) {
        this.nome = nome;
        this.porcentagemReajuste = porcentagemReajuste;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPorcentagemReajuste() {
        return porcentagemReajuste;
    }

}
