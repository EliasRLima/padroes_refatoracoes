package atv04.questao03.states;

import atv04.questao03.Pedido;

public abstract class Status {

    Pedido pedido;

    Status(Pedido pedido){
        this.pedido = pedido;
    }

    public abstract String getStatus();
    public abstract void alterar();
    public abstract void cancelar();
    public abstract void enviar();

}
