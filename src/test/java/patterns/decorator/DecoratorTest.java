package patterns.decorator;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DecoratorTest {

    @Test
    public void testCalcularPrecoBaseQuarto() {
        QuartoHotel quartoHotel = new QuartoHotelBase();
        Assert.assertThat(quartoHotel.calcularPreco(), is(400.0));
    }

    @Test
    public void testCalcularPrecoQuartoComArCondicionado() {
        QuartoHotel quartoHotel = new ArCondicionadoQuartoHotel(new QuartoHotelBase());
        Assert.assertThat(quartoHotel.calcularPreco(), is(410.0));
    }

    @Test
    public void testCalcularPrecoQuartoComCamaKingSize() {
        QuartoHotel quartoHotel = new CamaKingSizeQuartoHotel(new QuartoHotelBase());
        Assert.assertThat(quartoHotel.calcularPreco(), is(430.0));
    }

    @Test
    public void testCalcularPrecoQuartoComTvCabo() {
        QuartoHotel quartoHotel = new TVCaboQuartoHotel(new QuartoHotelBase());
        Assert.assertThat(quartoHotel.calcularPreco(), is(405.0));
    }

    @Test
    public void testCalcularPrecoQuartoComArCondicionadoTVCabo() {
        QuartoHotel quartoHotel = new TVCaboQuartoHotel(new ArCondicionadoQuartoHotel(new QuartoHotelBase()));
        Assert.assertThat(quartoHotel.calcularPreco(), is(415.0));
    }

    @Test
    public void testCalcularPrecoQuartoComArCondicionadoCamaKingSize() {
        QuartoHotel quartoHotel = new CamaKingSizeQuartoHotel( new ArCondicionadoQuartoHotel(new QuartoHotelBase()));
        Assert.assertThat(quartoHotel.calcularPreco(), is(440.0));
    }

    @Test
    public void testCalcularPrecoQuartoComArCondicionadoTVCaboCamaKingSize() {
        QuartoHotel quartoHotel = new CamaKingSizeQuartoHotel(new TVCaboQuartoHotel(new ArCondicionadoQuartoHotel(new QuartoHotelBase())));
        Assert.assertThat(quartoHotel.calcularPreco(), is(445.0));
    }

    @Test
    public void testCalcularPrecoQuartoComCamaKingSizeArCondicionado() {
        QuartoHotel quartoHotel =  new CamaKingSizeQuartoHotel(new ArCondicionadoQuartoHotel(new QuartoHotelBase()));
        Assert.assertThat(quartoHotel.calcularPreco(), is(440.0));
    }

}