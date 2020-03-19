package patterns.decorator;

public class ArCondicionadoQuartoHotel extends QuartoHotelDecorator {

    public ArCondicionadoQuartoHotel(QuartoHotel quartoHotel) {
        super(quartoHotel);
    }

    @Override
    public double calcularPreco() {
        return quartoHotel.calcularPreco() + 10.0;
    }
}
