package patterns.builder;

import java.util.Date;

public class BoletoBuilder implements BoletoBuilderInterface {
    protected Boleto boleto;

    public Boleto getBoleto() {
        return boleto;
    }

    public void createNewBoleto() {
        boleto = new Boleto();
    }

    @Override
    public void buildBeneficiario(String benificiario) {
        this.boleto.setBeneficiario(benificiario);
    }

    @Override
    public void buildBanco(String banco) {
        this.boleto.setBanco(banco);
    }

    @Override
    public void buildDataVencimento(Date dataVencimento) {
        this.boleto.setDataVencimento(dataVencimento);
    }

    @Override
    public void buildCodigoBarras(String codigoBarras) {
        this.boleto.setCodigoBarras(codigoBarras);
    }

    @Override
    public void buildValor(double valor) {
        this.boleto.setValor(valor);
    }

    @Override
    public void buildDesconto(double desconto) {
        this.boleto.setDesconto(desconto);
    }

    @Override
    public void buildMulta(double multa) {
        this.boleto.setMulta(multa);
    }

    @Override
    public void buildDescricao(String descricao) {
        this.boleto.setDescricao(descricao);
    }
}
