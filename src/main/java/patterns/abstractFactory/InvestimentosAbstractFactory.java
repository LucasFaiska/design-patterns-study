package patterns.abstractFactory;

import patterns.abstractFactory.factory.CDBFactory;
import patterns.abstractFactory.factory.PoupancaFactory;
import patterns.abstractFactory.product.Indice;
import patterns.abstractFactory.product.Rendimento;
import patterns.abstractFactory.model.TipoInvestimento;

public abstract class InvestimentosAbstractFactory {

    private static final PoupancaFactory poupancaFactory = new PoupancaFactory();
    private static final CDBFactory cdbFactory = new CDBFactory();

    public static InvestimentosAbstractFactory getFactory(TipoInvestimento tipoInvestimento) {
        InvestimentosAbstractFactory factory = null;
        switch (tipoInvestimento) {
            case POUPANCA:
                factory = poupancaFactory;
                break;
            case CDB:
                factory = cdbFactory;
                break;
        }
        return factory;
    }

    public abstract Indice getIndice();
    public abstract Rendimento getRendimento();

}
