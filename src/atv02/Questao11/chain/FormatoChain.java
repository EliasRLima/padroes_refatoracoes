package atv02.Questao11.chain;

import atv02.Questao11.Conta;
import atv02.Questao11.Requisicao;

public abstract class FormatoChain {

    public FormatoChain nextFormato;

    public FormatoChain(FormatoChain nextFormato) {
        this.nextFormato = nextFormato;
    }

    public abstract boolean formatoCerto(Requisicao requisicao);

    public abstract String getFormatado(Requisicao requisicao, Conta conta);
}
