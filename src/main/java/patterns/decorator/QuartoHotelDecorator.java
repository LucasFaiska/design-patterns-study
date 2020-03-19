package patterns.decorator;

public class QuartoHotelDecorator implements QuartoHotel {

    protected QuartoHotel quartoHotel;

    public QuartoHotelDecorator(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    @Override
    public double calcularPreco() {
        return quartoHotel.calcularPreco();
    }
}
