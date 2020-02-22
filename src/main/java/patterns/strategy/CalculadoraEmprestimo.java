package patterns.strategy;

public class CalculadoraEmprestimo {

    private Emprestimo emprestimo;
    private double valor;
    private int totalMeses;

    public CalculadoraEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTotalMeses(int totalMeses) {
        this.totalMeses = totalMeses;
    }

    public double calcular() throws CalculoInvalidoEmprestimoException {
        if (this.valor <= 0 || this.totalMeses <= 0) throw new CalculoInvalidoEmprestimoException();
        return emprestimo.calcularValorTotal(this.valor, this.totalMeses);
    }

    public static class CalculoInvalidoEmprestimoException extends Throwable { }
}
