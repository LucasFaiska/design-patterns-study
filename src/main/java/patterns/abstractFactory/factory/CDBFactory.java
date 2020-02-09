package patterns.abstractFactory.factory;

import patterns.abstractFactory.InvestimentosAbstractFactory;
import patterns.abstractFactory.product.Indice;
import patterns.abstractFactory.product.Rendimento;

public class CDBFactory extends InvestimentosAbstractFactory {

    @Override
    public Indice getIndice() {
        return new Indice("CDI", 17.75);
    }

    @Override
    public Rendimento getRendimento() {
        return new Rendimento(118.0, 271);
    }
}
