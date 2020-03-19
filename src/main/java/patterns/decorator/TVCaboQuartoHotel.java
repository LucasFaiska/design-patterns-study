package patterns.decorator;

public class TVCaboQuartoHotel extends QuartoHotelDecorator {

    public TVCaboQuartoHotel(QuartoHotel quartoHotel) {
        super(quartoHotel);
    }

    @Override
    public double calcularPreco() {
        return quartoHotel.calcularPreco() + 5.0;
    }
}
