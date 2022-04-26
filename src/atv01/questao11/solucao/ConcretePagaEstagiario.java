package atv01.questao11.solucao;

public class ConcretePagaEstagiario implements PagadorStrategy{
    @Override
    public void pagar() {
        //estagiario.paga(  estagiario.getBolsa() +
                         // estagiario.getAuxilios());
        System.out.println("Paga estagiario");
    }
}
