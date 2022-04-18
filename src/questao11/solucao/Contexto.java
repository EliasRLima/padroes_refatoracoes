package questao11.solucao;

public class Contexto {

    private PagadorStrategy strategy;

    public void setStrategy(PagadorStrategy strategy) {
        this.strategy = strategy;
    }

    public void executaStrategy(){
        strategy.pagar();
    }
}
