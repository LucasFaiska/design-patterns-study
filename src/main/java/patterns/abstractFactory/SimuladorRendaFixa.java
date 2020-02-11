package patterns.abstractFactory;
import patterns.abstractFactory.product.Indice;
import patterns.abstractFactory.product.Rendimento;
import patterns.abstractFactory.model.TipoInvestimento;

public class SimuladorRendaFixa {

    private static int DIAS_UTEIS_ANO = 252;
    private static int SEIS_MESES = 180;
    private static int UM_ANO = 360;
    private static int DOIS_ANOS = 720;

    public double simulaInvestimento(TipoInvestimento tipoInvestimento, final int quantidadeDias, final double valor) {
        if (quantidadeDias <= 0 || valor <= 0)
            throw new IllegalArgumentException();

        InvestimentosAbstractFactory factory = InvestimentosAbstractFactory.getFactory(tipoInvestimento);
        Rendimento rendimento = factory.getRendimento();
        Indice indice = factory.getIndice();

        double baseCalc1 = indice.getValor()/ 100 * rendimento.getValor()/ 100 + 1;
        double baseCalc2 = rendimento.getDiasUteis() / DIAS_UTEIS_ANO;
        double baseCalc3 = Math.pow(baseCalc1, baseCalc2);
        double totalBruto = valor * baseCalc3;
        double impostoRenda = (totalBruto - valor) * (getAliquotaImpostoRenda(quantidadeDias) / 100);
        double quantidadeAnos = ((double)quantidadeDias / UM_ANO);
        return quantidadeAnos * (totalBruto - impostoRenda);
    }

    private double getAliquotaImpostoRenda(int quantidadeDias) {
        if (quantidadeDias <= SEIS_MESES) {
            return 22.5;
        } else if (quantidadeDias <= UM_ANO) {
            return 20.0;
        } else if (quantidadeDias <= DOIS_ANOS) {
            return 17.5;
        } else {
            return 15;
        }
    }
}
