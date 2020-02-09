package patterns.bridge.implementation;

import patterns.bridge.abstraction.PagamentoTransferencia;

public class PagamentoTransferenciaTed implements PagamentoTransferencia {
    @Override
    public void transferir(double valor) {
        System.out.println("Realizando um TED de " + valor);
        System.out.println("Taxa de R$: 17,00");
    }
}
