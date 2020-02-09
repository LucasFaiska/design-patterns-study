package patterns.proxy;

public class ClienteProxy implements Cliente {

    private int id;
    private Cliente cliente;

    public ClienteProxy(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return getCliente() != null ? getCliente().getId() : 0;
    }

    @Override
    public String getNome() {
        return getCliente() != null ? getCliente().getNome() : "";
    }

    @Override
    public double getSaldo() {
        return getCliente() != null ? getCliente().getSaldo() : 0.00;
    }

    @Override
    public TipoCliente getTipo() {
        return getCliente() != null ? getCliente().getTipo() : null;
    }

    private Cliente getCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();

        if (cliente == null) {
            cliente = clienteDAO.getCliente(this.id);
        }

        return cliente;
    }
}
