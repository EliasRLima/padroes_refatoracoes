package atv04.questao03;

import atv04.questao03.states.Enviado;
import atv04.questao03.states.Processando;
import atv04.questao03.states.Status;

public class Pedido {

    private Status status;

    public Pedido() {
        this.status = new Processando(this);
    }

    public void changeStatus(Status status){
        this.status = status;
    }

    public String getStatus() {
        return this.status.getStatus();
    }

    public void enviar(){
        this.status.enviar();
    }

    public void editar(){
        this.status.alterar();
    }

    public void cancelar(){
        this.status.cancelar();
    }
}
