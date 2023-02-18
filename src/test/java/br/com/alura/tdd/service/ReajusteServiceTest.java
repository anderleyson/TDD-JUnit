package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    @Test
    @DisplayName("Deve reajustar o salário do funcionário em 3% quando o desempenho for a desejar")
    void reajusteDesempenhoADesejar(){
        ReajusteService reajuste = new ReajusteService();
        Funcionario funcionario = new Funcionario("Leysao", LocalDate.now(), new BigDecimal("1000.00"));

        reajuste.aplicarReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Deve reajustar o salário do funcionário em 10% quando o desempenho for bom")
    void reajusteDesempenhoBom(){
        ReajusteService reajuste = new ReajusteService();
        Funcionario funcionario = new Funcionario("Leysao", LocalDate.now(), new BigDecimal("1000.00"));

        reajuste.aplicarReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Deve reajustar o salário do funcionário em 15% quando o desempenho for ótimo")
    void reajusteDesempenhoOtimo(){
        ReajusteService reajuste = new ReajusteService();
        Funcionario funcionario = new Funcionario("Leysao", LocalDate.now(), new BigDecimal("1000.00"));

        reajuste.aplicarReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }


}
