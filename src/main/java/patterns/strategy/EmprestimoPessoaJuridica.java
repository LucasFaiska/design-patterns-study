package patterns.strategy;

public class EmprestimoPessoaJuridica implements Emprestimo {

    private static double VALOR_JUROS_1_ANO = 1.3;
    private static double VALOR_JUROS_2_ANOS = 1.2;
    private static double VALOR_JUROS_MAIS_2_ANOS = 1.1;

    private double calculaJuros(int totalMeses) {
        if (totalMeses > 24 ) {
            return VALOR_JUROS_MAIS_2_ANOS;
        } else if (totalMeses > 12){
            return VALOR_JUROS_2_ANOS;
        } else {
            return VALOR_JUROS_1_ANO;
        }
    }

    @Override
    public double calcularValorTotal(double valor, int totalMeses) {
        return valor * calculaJuros(totalMeses);
    }
}
