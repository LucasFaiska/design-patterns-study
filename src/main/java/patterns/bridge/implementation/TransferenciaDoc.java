package patterns.bridge.implementation;

import patterns.bridge.abstraction.PagamentoTransferencia;
import patterns.bridge.abstraction.Transferencia;

public class TransferenciaDoc extends Transferencia {

    public TransferenciaDoc(PagamentoTransferencia pagamentoTransferencia) {
        super(pagamentoTransferencia);
    }

    @Override
    public void transferir(double valor) {
        pagamentoTransferencia.transferir(valor);
    }
}
