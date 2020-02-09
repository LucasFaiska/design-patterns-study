package patterns.builder;

import java.util.Date;

//Produto
public class Boleto {
    private String beneficiario;
    private String banco;
    private Date dataVencimento;
    private String codigoBarras;
    private double valor;
    private double desconto;
    private double multa;
    private String descricao;

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  getBeneficiario() + "\n" +
                getBanco() + "\n" +
                getDataVencimento().toString() + "\n" +
                getCodigoBarras() + "\n" +
                getValor() + "\n" +
                getDesconto() + "\n" +
                getMulta() + "\n" +
                getDescricao() + "\n";
    }
}
