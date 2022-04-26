package atv01.questao11.solucao;

public class ConcretePagaChefe implements PagadorStrategy{

    @Override
    public void pagar() {
        //chefe.depositaNaConta(chefe.getSalarioBase() +
                //chefe.getBonificacoes());
        System.out.println("Pagando chefe");
    }
}
