package atv04.questao02.states;

import atv04.questao02.Conta;

public class Positiva extends EstadoConta{

    public Positiva(Conta conta) {
        super(conta);
    }

    @Override
    public void sacar(double valor) {
        double novosaldo = conta.getSaldo() - valor;
        conta.setSaldo(novosaldo);

        if(novosaldo < 0){
            conta.mudaEstado(new Negativa(conta));
        }
    }

    @Override
    public void deposito(double valor) {
        double valordeposito = valor*0.98;
        double novosaldo = conta.getSaldo() + valordeposito;
        conta.setSaldo(novosaldo);
    }
}
