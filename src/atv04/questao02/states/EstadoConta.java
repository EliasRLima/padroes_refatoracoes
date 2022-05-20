package atv04.questao02.states;

import atv04.questao02.Conta;

public abstract class EstadoConta {

    Conta conta;

    public EstadoConta(Conta conta) {
        this.conta = conta;
    }

    public abstract void sacar(double valor);
    public abstract void deposito(double valor);


}
