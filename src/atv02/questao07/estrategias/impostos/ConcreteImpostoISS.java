package atv02.questao07.estrategias.impostos;

public class ConcreteImpostoISS implements ImpostoStrategy {
    @Override
    public double calcular(double orcamento) {
        return orcamento*0.06;
    }
}
