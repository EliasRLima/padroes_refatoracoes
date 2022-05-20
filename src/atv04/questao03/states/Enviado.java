package atv04.questao03.states;

import atv04.questao03.Pedido;

public class Enviado extends Status{

    public Enviado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getStatus() {
        return "O pedido foi enviado.";
    }

    @Override
    public void alterar() {
        String msg2 = "Não é possivel realizar alterações pois o pedido já foi enviado";
        throw new IllegalStateException(msg2);
    }

    @Override
    public void cancelar() {
        String msg2 = "Não é possivel cancelar pois o pedido já foi enviado";
        throw new IllegalStateException(msg2);
    }

    @Override
    public void enviar() {
        String msg2 = "O pedido já foi enviado";
        throw new IllegalStateException(msg2);
    }
}
