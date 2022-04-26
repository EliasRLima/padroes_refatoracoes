package atv01.questao12;

public class ConcreteInvestirConservador implements InvestimentoStrategy{
    @Override
    public double investir(double valor) {
        return valor*0.008;
    }
}
