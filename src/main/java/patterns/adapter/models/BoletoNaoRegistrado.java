package patterns.adapter.models;

public class BoletoNaoRegistrado implements BoletoInterface {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando Boleto Não Registrado");
    }
}
