package patterns.proxy;

import java.util.HashMap;

public class ClienteDAO {


    HashMap<Integer, Cliente> bancoDedados = new HashMap<Integer, Cliente>();

    private void mockaDados() {
        bancoDedados.put(1, new ClienteImpl(1, "Lucas de Oliveira Gonçalves", 1000.00, TipoCliente.PESSOA_FISICA));
        bancoDedados.put(2, new ClienteImpl(2, "Stark Coorp", 10000000.00, TipoCliente.PESSOA_JURIDICA));
        bancoDedados.put(3, new ClienteImpl(3, "Leticia Carvalho", 5000.00, TipoCliente.PESSOA_FISICA));
        bancoDedados.put(4, new ClienteImpl(4, "Grêmio", 999999.00, TipoCliente.PESSOA_JURIDICA));
        bancoDedados.put(5, new ClienteImpl(5, "Biriba", 0.00, TipoCliente.PESSOA_FISICA));
    }

    public ClienteDAO() {
        mockaDados();
    }


    public Cliente getCliente(int id) {
        System.out.println("Buscando Cliente no Banco de Dados");

        if (this.bancoDedados.get(id) != null) {
            return this.bancoDedados.get(id);
        } else {
            System.out.println("Cliente não encontrado");
            return null;
        }
    }

}
