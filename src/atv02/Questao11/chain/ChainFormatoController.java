package atv02.Questao11.chain;

import atv02.Questao11.Requisicao;
import atv02.Questao11.Conta;

public class ChainFormatoController {

    private FormatoChain inicioChain;

    public ChainFormatoController() {
        this.inicioChain = new FormatoJSON();
    }

    public String getFormatado(Requisicao requisicao, Conta conta){
        return inicioChain.getFormatado(requisicao, conta);
    }
}
