package patterns.builder;

import java.util.Date;

//Classe Builder
interface BoletoBuilderInterface {
    void buildBeneficiario(String benificiario);
    void buildBanco(String banco);
    void buildDataVencimento(Date dataVencimento);
    void buildCodigoBarras(String codigoBarras);
    void buildValor(double valor);
    void buildDesconto(double desconto);
    void buildMulta(double multa);
    void buildDescricao(String descricao);
}
