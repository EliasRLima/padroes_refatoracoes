package atv02.questao07.estrategias.impostos;

public class ImpostoContexto {

    private ImpostoStrategy impostoStrategy;

    public void setImpostoStrategy(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public double execute(double valor){
        return impostoStrategy.calcular(valor);
    }
}
