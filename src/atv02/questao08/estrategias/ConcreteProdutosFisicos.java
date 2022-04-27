package atv02.questao08.estrategias;

public class ConcreteProdutosFisicos implements  DescontoEstrategia{

    @Override
    public double getDesconto() {
        return 0.3;
    }
}
