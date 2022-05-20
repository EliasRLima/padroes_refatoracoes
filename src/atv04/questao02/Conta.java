package atv04.questao02;

import atv04.questao02.states.EstadoConta;

public class Conta {

    private EstadoConta estado;
    private double saldo;

    public Conta(EstadoConta estado) {
        this.estado = estado;
    }

    public void mudaEstado(EstadoConta estadoConta){
        this.estado = estadoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        this.estado.sacar(valor);
    }

    public void depositar(double valor){
        this.estado.deposito(valor);
    }
}
