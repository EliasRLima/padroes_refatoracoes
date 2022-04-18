package questao11.solucao;

public class ConcretePagaFuncionario implements PagadorStrategy{

    @Override
    public void pagar() {
        //funcionario.depositaNaConta(funcionario.getSalario() +
                //funcionario.getBonus());
        System.out.println("Paga funcionario");
    }
}
