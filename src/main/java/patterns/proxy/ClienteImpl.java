package patterns.proxy;

public class ClienteImpl implements Cliente {

    private int id;
    private String nome;
    private double saldo;
    private TipoCliente tipo;

    public ClienteImpl(int id, String nome, double saldo, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
