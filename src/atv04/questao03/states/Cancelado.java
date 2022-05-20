package atv04.questao03.states;

import atv04.questao03.Pedido;

public class Cancelado extends Status{

    public Cancelado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getStatus() {
        return "O pedido foi cancelado.";
    }

    @Override
    public void alterar() {
        String msg1 = "Não é possivel realizar alterações pois o pedido foi cancelado";
        throw new IllegalStateException(msg1);
    }

    @Override
    public void cancelar() {
        String msg1 = "O pedido já foi cancelado";
        throw new IllegalStateException(msg1);
    }

    @Override
    public void enviar() {
        String msg1 = "Não é possivel enviar pois o pedido foi cancelado";
        throw new IllegalStateException(msg1);
    }
}
