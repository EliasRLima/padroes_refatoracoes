package atv02.questao07.estrategias.impostos;

public class ConcreteImpostoICMS implements ImpostoStrategy {
    @Override
    public double calcular(double orcamento) {
        return orcamento*0.25;
    }
}
