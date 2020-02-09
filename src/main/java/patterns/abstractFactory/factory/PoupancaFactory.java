package patterns.abstractFactory.factory;

import patterns.abstractFactory.InvestimentosAbstractFactory;
import patterns.abstractFactory.product.Indice;
import patterns.abstractFactory.product.Rendimento;

public class PoupancaFactory extends InvestimentosAbstractFactory {

    @Override
    public Indice getIndice() {
        return new Indice("Selic", 8.15);
    }

    @Override
    public Rendimento getRendimento() {
        return new Rendimento(60.0, 365);
    }
}
