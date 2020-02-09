package patterns.bridge.implementation;

import patterns.bridge.abstraction.PagamentoTransferencia;

public class PagamentoTransferenciaDoc implements PagamentoTransferencia {
    @Override
    public void transferir(double valor) {
        System.out.println("Realizando um DOC de " + valor);
        System.out.println("Taxa de R$: 8,00");
    }
}
