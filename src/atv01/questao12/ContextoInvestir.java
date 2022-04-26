package atv01.questao12;

public class ContextoInvestir {

    private InvestimentoStrategy strategy;

    public void setStrategy(InvestimentoStrategy strategy) {
        this.strategy = strategy;
    }

    public double executaStrategy(Double valor){
        return this.strategy.investir(valor);
    }
}
