package atv04.questao02;

import atv04.questao02.states.EstadoConta;

public class Conta {

    private EstadoConta estado;

    public Conta(EstadoConta estado) {
        this.estado = estado;
    }

    public void mudaEstado(EstadoConta estadoConta){
        this.estado = estadoConta;
    }
}
