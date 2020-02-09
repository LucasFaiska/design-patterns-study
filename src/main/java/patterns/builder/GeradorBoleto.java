package patterns.builder;

import java.util.Date;

// Director
public class GeradorBoleto {
    private BoletoBuilder boletoBuilder;

    public void setBoletoBuilder(BoletoBuilder boletoBuilder) {
        this.boletoBuilder = boletoBuilder;
    }

    public Boleto getBoleto() {
        return boletoBuilder.getBoleto();
    }

    public void geraBoleto() {
        this.boletoBuilder.createNewBoleto();
        this.boletoBuilder.buildBeneficiario("Mapfre Seguros");
        this.boletoBuilder.buildBanco("Banco do Brasil");
        this.boletoBuilder.buildDataVencimento(new Date());
        this.boletoBuilder.buildCodigoBarras("1234567891234567891234567891234568798");
        this.boletoBuilder.buildValor(100.0);
        this.boletoBuilder.buildDesconto(0.0);
        this.boletoBuilder.buildMulta(0.0);
        this.boletoBuilder.buildDescricao("Bla bla bla bla bla");
    }
}
