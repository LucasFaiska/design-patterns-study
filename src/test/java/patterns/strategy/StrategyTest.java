package patterns.strategy;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;

public class StrategyTest {

    @Mock
    private Emprestimo emprestimo;

    private CalculadoraEmprestimo calculadoraEmprestimo;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        calculadoraEmprestimo = new CalculadoraEmprestimo(emprestimo);
    }

    @Test
    public void testCalculadoraEmprestimo() {
        double result = 0.0;
        when(emprestimo.calcularValorTotal(100, 12)).thenReturn(130.0);

        calculadoraEmprestimo.setTotalMeses(12);
        calculadoraEmprestimo.setValor(100);

        try {
             result = calculadoraEmprestimo.calcular();
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException ignored) { }

        Assert.assertThat(result, is(130.0));
    }
}
