package atv02.questao07;

import atv02.questao07.estrategias.impostos.ImpostoContexto;
import atv02.questao07.estrategias.impostos.ImpostoStrategy;

public class CalculadorImposto {

    private double valor;
    private Orcamento orcamento;
    private ImpostoContexto impostoContexto;

    public CalculadorImposto(double valor, Orcamento orcamento) {
        this.valor = valor;
        this.orcamento = orcamento;
    }

    public double calcularImposto(ImpostoStrategy estrategia){
        impostoContexto.setImpostoStrategy(estrategia);
        return impostoContexto.execute(this.orcamento.getValor());
    }
}
