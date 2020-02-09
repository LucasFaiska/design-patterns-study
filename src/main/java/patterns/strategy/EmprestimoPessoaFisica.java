package patterns.strategy;

public class EmprestimoPessoaFisica implements Emprestimo {

    private static double VALOR_JUROS_1_ANO = 1.5;
    private static double VALOR_JUROS_MAIS_1_ANO = 1.3;

    private double calculaJuros(int totalMeses) {
        if (totalMeses > 12 ) {
            return VALOR_JUROS_MAIS_1_ANO;
        } else {
            return VALOR_JUROS_1_ANO;
        }
    }

    @Override
    public double calcularValorTotal(double valor, int totalMeses) {
        return valor * calculaJuros(totalMeses);
    }
}
