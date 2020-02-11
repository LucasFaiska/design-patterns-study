package patterns.abstractFactory;

import org.junit.Assert;
import org.junit.Test;
import patterns.abstractFactory.model.TipoInvestimento;

import static org.hamcrest.CoreMatchers.is;

public class AbstractFactoryTest {

    private SimuladorRendaFixa simuladorRendaFixa = new SimuladorRendaFixa();

    @Test
    public void testCDBSeisMeses1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.CDB,180, 1000.0);
        Assert.assertThat(rendimento, is(581.1618749999999));
    }

    @Test
    public void testPoupancaSeisMeses1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.POUPANCA,180, 1000.0);
        Assert.assertThat(rendimento, is(518.9487499999999));
    }

    @Test
    public void testCDBUmAno1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.CDB,360, 1000.0);
        Assert.assertThat(rendimento, is(1167.56));
    }

    @Test
    public void testPoupancaUmAno1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.POUPANCA,360, 1000.0);
        Assert.assertThat(rendimento, is(1039.12));
    }

    @Test
    public void testCDBDoisAnos1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.CDB,720, 1000.0);
        Assert.assertThat(rendimento, is(2345.5924999999997));
    }

    @Test
    public void testPoupancaDoisAnos1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.POUPANCA,720, 1000.0);
        Assert.assertThat(rendimento, is(2080.685));
    }

    @Test
    public void testCDBTresAnos1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.CDB,1080, 1000.0);
        Assert.assertThat(rendimento, is(3534.0974999999994));
    }

    @Test
    public void testPoupancaTresAnos1000reais() {
        double rendimento = simuladorRendaFixa.simulaInvestimento(TipoInvestimento.POUPANCA,1080, 1000.0);
        Assert.assertThat(rendimento, is(3124.6949999999997));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPoupanca0reais() {
        simuladorRendaFixa.simulaInvestimento(TipoInvestimento.POUPANCA,1080, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCDB0reais() {
        simuladorRendaFixa.simulaInvestimento(TipoInvestimento.POUPANCA,1080, 0.0);
    }
}
