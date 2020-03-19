package patterns.decorator;

public class CamaKingSizeQuartoHotel extends QuartoHotelDecorator {

    public CamaKingSizeQuartoHotel(QuartoHotel quartoHotel) {
        super(quartoHotel);
    }

    @Override
    public double calcularPreco() {
        return quartoHotel.calcularPreco() + 30.0;
    }
}
