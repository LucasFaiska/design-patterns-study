package patterns.factoryMethod;

public class ClientePessoaJuridica implements Cliente {

    private String nome;
    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double getLimite() {
        return 50000.0;
    }
}
