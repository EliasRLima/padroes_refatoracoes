package atv04.questao03.states;

import atv04.questao03.Pedido;

public class Processando extends Status{

    public Processando(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getStatus() {
        return "Processando o pedido";
    }

    @Override
    public void alterar() {
        // código para alteração do pedido
    }

    @Override
    public void cancelar() {
        pedido.changeStatus(new Cancelado(pedido));
    }

    @Override
    public void enviar() {
        pedido.changeStatus(new Enviado(pedido));
    }
}
