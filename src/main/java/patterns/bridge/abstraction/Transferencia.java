package patterns.bridge.abstraction;

public abstract class Transferencia {
    protected PagamentoTransferencia pagamentoTransferencia;

    public Transferencia(PagamentoTransferencia pagamentoTransferencia) {
        this.pagamentoTransferencia = pagamentoTransferencia;
    }

    abstract public void transferir(double valor);
}
