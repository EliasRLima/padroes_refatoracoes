package atv04.questao02.states;

import atv04.questao02.Conta;

public class Negativa extends EstadoConta{

    public Negativa(Conta conta) {
        super(conta);
    }

    @Override
    public void sacar(double valor) {
        String msg1 = "Não é possivel realizar saques, pois a conta esta negativada.";
        throw new IllegalStateException(msg1);
    }

    @Override
    public void deposito(double valor) {
        double valordeposito = valor*0.95;
        double novosaldo = conta.getSaldo() + valordeposito;
        conta.setSaldo(novosaldo);

        if(novosaldo > 0){
            conta.mudaEstado(new Positiva(conta));
        }
    }
}
