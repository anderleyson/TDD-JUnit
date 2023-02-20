package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    private ReajusteService reajuste;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        this.reajuste = new ReajusteService();
        this.funcionario = new Funcionario("Leysao", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    @DisplayName("Deve reajustar o salário do funcionário em 3% quando o desempenho for a desejar")
    void reajusteDesempenhoADesejar(){
        reajuste.aplicarReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Deve reajustar o salário do funcionário em 10% quando o desempenho for bom")
    void reajusteDesempenhoBom(){
        reajuste.aplicarReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Deve reajustar o salário do funcionário em 15% quando o desempenho for ótimo")
    void reajusteDesempenhoOtimo(){
        reajuste.aplicarReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

}
