package atv02.questao10;

import atv02.questao10.chain.ContadorChain;
import atv02.questao10.chain.NotasCemChain;

public class CaixaEletronico {

    private ContadorChain chainStart;

    public CaixaEletronico() {
        this.chainStart = new NotasCemChain();
    }

    public String contaMinimoNotas(double value){
        return this.chainStart.Contar(value);
    }
}
