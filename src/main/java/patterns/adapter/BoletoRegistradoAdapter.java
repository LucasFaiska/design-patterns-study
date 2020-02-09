package patterns.adapter;

import patterns.adapter.models.BoletoInterface;
import patterns.adapter.models.BoletoRegistrado;

import java.util.UUID;

public class BoletoRegistradoAdapter implements BoletoInterface {
    private BoletoRegistrado adaptee;

    public BoletoRegistradoAdapter(BoletoRegistrado boletoRegistrado) {
        this.adaptee = boletoRegistrado;
    }

    @Override
    public void pagar(double valor) {
        this.adaptee.pagar(registrarBoleto(), valor);
    }

    private String registrarBoleto() {
        return UUID.randomUUID().toString();
    }
}
