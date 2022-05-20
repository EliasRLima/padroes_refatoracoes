package atv04.questao03;

public class teste {

    public static void main(String[] args) {
        //novo pedido de pizza
        Pedido pedidopizza = new Pedido();

        //novo pedido de hotdog
        Pedido pedidohotdog = new Pedido();

        //enviar pedido de pizza
        pedidopizza.enviar();

        //listar os status dos pedidos
        System.out.println("Status do pedido de pizza: " + pedidopizza.getStatus());
        System.out.println("Status do pedido de hotdog: " + pedidohotdog.getStatus());

        //cancelar hotdog
        pedidohotdog.cancelar();

        //listar os status dos pedidos
        System.out.println("Status do pedido de pizza: " + pedidopizza.getStatus());
        System.out.println("Status do pedido de hotdog: " + pedidohotdog.getStatus());

        //tentar cancelar pizza (enviado)
        pedidopizza.cancelar();

        //listar os status dos pedidos
        System.out.println("Status do pedido de pizza: " + pedidopizza.getStatus());
        System.out.println("Status do pedido de hotdog: " + pedidohotdog.getStatus());

    }

}
