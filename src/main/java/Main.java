import patterns.abstractFactory.client.SimuladorInvestimentos;
import patterns.abstractFactory.model.TipoInvestimento;
import patterns.adapter.BoletoRegistradoAdapter;
import patterns.adapter.models.BoletoNaoRegistrado;
import patterns.adapter.models.BoletoRegistrado;
import patterns.bridge.abstraction.PagamentoTransferencia;
import patterns.bridge.abstraction.Transferencia;
import patterns.bridge.implementation.PagamentoTransferenciaDoc;
import patterns.bridge.implementation.PagamentoTransferenciaTed;
import patterns.bridge.implementation.TransferenciaDoc;
import patterns.builder.BoletoBuilder;
import patterns.builder.GeradorBoleto;
import patterns.factoryMethod.Cliente;
import patterns.factoryMethod.ClientePessoaFísica;
import patterns.factoryMethod.ClientePessoaJuridica;
import patterns.proxy.ClienteProxy;
import patterns.strategy.CalculadoraEmprestimo;
import patterns.strategy.EmprestimoPessoaFisica;
import patterns.strategy.EmprestimoPessoaJuridica;

public class Main {

    public static void main(String[] args) {
        abstractFactory();
        builder();
        factoryMethod();
        proxy();
        bridge();
        adapter();
        strategy();
    }

    private static void abstractFactory() {
        System.out.println("Abstract Factory ----------------------");
        SimuladorInvestimentos simuladorInvestimentos = new SimuladorInvestimentos();
        System.out.println(simuladorInvestimentos.simulaInvestimento(TipoInvestimento.CDB, 720, 1000.0));
        System.out.println(simuladorInvestimentos.simulaInvestimento(TipoInvestimento.POUPANCA, 720, 1000.0));
    }

    private static void builder() {
        System.out.println("Builder ----------------------");
        BoletoBuilder boletoBuilder = new BoletoBuilder();
        GeradorBoleto geradorBoleto = new GeradorBoleto();
        geradorBoleto.setBoletoBuilder(boletoBuilder);
        geradorBoleto.geraBoleto();
        System.out.println(geradorBoleto.getBoleto());
    }

    private static void factoryMethod() {
        System.out.println("Factory Method ----------------------");
        Cliente cliente;
        cliente = new ClientePessoaFísica("Lucas", "123456789");
        System.out.println(cliente.getLimite());
        cliente = new ClientePessoaJuridica("Bazinga Coorp.", "987654321");
        System.out.println(cliente.getLimite());
    }

    private static void proxy() {
        System.out.println("Proxy ----------------------");
        ClienteProxy cliente1 = new ClienteProxy(1);
        ClienteProxy cliente2 = new ClienteProxy(2);
        ClienteProxy cliente3 = new ClienteProxy(3);
        ClienteProxy cliente4 = new ClienteProxy(4);
        ClienteProxy cliente5 = new ClienteProxy(5);
        ClienteProxy cliente6 = new ClienteProxy(6);

        System.out.println("Cliente 1: " + cliente1.getNome());
        System.out.println("Cliente 2: " + cliente2.getNome());
        System.out.println("Cliente 3: " + cliente3.getNome());
        System.out.println("Cliente 4: " + cliente4.getNome());
        System.out.println("Cliente 5: " + cliente5.getNome());

        // Cliente inexistente
        System.out.println("Cliente 6: " + cliente6.getNome());

        // Não vai acessar novamente o Banco de Dados para buscar essa informação
        System.out.println("Cliente 1: " + cliente1.getNome());
    }

    private static void bridge() {
        System.out.println("Bridge ----------------------");
        PagamentoTransferencia pagamentoTransferenciaDoc = new PagamentoTransferenciaDoc();
        Transferencia transferenciaDoc = new TransferenciaDoc(pagamentoTransferenciaDoc);
        transferenciaDoc.transferir(100.0);

        PagamentoTransferencia pagamentoTransferenciaTed = new PagamentoTransferenciaTed();
        Transferencia transferenciaTed = new TransferenciaDoc(pagamentoTransferenciaTed);
        transferenciaTed.transferir(150.0);
    }

    private static void adapter() {
        System.out.println("Adapter ----------------------");
        //Sistema realizava pagamentos de boletos não registrados normalmente
        BoletoNaoRegistrado boletoNaoRegistrado = new BoletoNaoRegistrado();
        boletoNaoRegistrado.pagar(100.0);

        //Porém agora existem boletos que precisam ser registrados antes de serem pagos
        //para essa nova regra cria-se um adapter para não precisar alterar todas as vezes
        //que o sistema faz um pagamento de boleto
        BoletoRegistradoAdapter boletoRegistradoAdapter = new BoletoRegistradoAdapter(new BoletoRegistrado());
        boletoRegistradoAdapter.pagar(100.0);
    }

    private static void strategy() {
        System.out.println("Strategy ----------------------");
        CalculadoraEmprestimo calculadoraEmprestimoPessoaJuridica = new CalculadoraEmprestimo(new EmprestimoPessoaJuridica());
        CalculadoraEmprestimo calculadoraEmprestimoPessoaFisica = new CalculadoraEmprestimo(new EmprestimoPessoaFisica());

        calculadoraEmprestimoPessoaJuridica.setValor(100);
        calculadoraEmprestimoPessoaJuridica.setTotalMeses(12);

        try {
            System.out.println("Valor Total Emprestimo Pessoa Jurídica até 1 Ano: " + calculadoraEmprestimoPessoaJuridica.calcular());
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException e) {
            System.out.println("Parametros inválidos para calcular empréstimo");
        }

        calculadoraEmprestimoPessoaJuridica.setValor(100);
        calculadoraEmprestimoPessoaJuridica.setTotalMeses(15);
        try {
            System.out.println("Valor Total Emprestimo Pessoa Jurídica até 2 Anos: " + calculadoraEmprestimoPessoaJuridica.calcular());
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException e) {
            System.out.println("Parametros inválidos para calcular empréstimo");
        }

        calculadoraEmprestimoPessoaJuridica.setValor(100);
        calculadoraEmprestimoPessoaJuridica.setTotalMeses(28);
        try {
            System.out.println("Valor Total Emprestimo Pessoa Jurídica mais de 2 Anos: " + calculadoraEmprestimoPessoaJuridica.calcular());
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException e) {
            System.out.println("Parametros inválidos para calcular empréstimo");
        }


        calculadoraEmprestimoPessoaFisica.setValor(100);
        calculadoraEmprestimoPessoaFisica.setTotalMeses(12);
        try {
            System.out.println("Valor Total Emprestimo Pessoa Física até 1 Ano: " + calculadoraEmprestimoPessoaFisica.calcular());
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException e) {
            System.out.println("Parametros inválidos para calcular empréstimo");
        }

        calculadoraEmprestimoPessoaFisica.setValor(100);
        calculadoraEmprestimoPessoaFisica.setTotalMeses(15);
        try {
            System.out.println("Valor Total Emprestimo Pessoa Física mais de 1 Ano: " + calculadoraEmprestimoPessoaFisica.calcular());
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException e) {
            System.out.println("Parametros inválidos para calcular empréstimo");
        }

        calculadoraEmprestimoPessoaFisica.setValor(0);
        calculadoraEmprestimoPessoaFisica.setTotalMeses(0);
        try {
            System.out.println("Valor Total Emprestimo Pessoa Física mais de 1 Ano: " + calculadoraEmprestimoPessoaFisica.calcular());
        } catch (CalculadoraEmprestimo.CalculoInvalidoEmprestimoException e) {
            System.out.println("Parametros inválidos para calcular empréstimo");
        }
    }
}
