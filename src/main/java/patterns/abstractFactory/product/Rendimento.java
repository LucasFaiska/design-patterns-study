package patterns.abstractFactory.product;

public class Rendimento {
    private double valor;
    private int diasUteis;

    public Rendimento(double valor, int diasUteis) {
        this.valor = valor;
        this.diasUteis = diasUteis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(int diasUteis) {
        this.diasUteis = diasUteis;
    }
}
