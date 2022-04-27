package atv02.questao08.estrategias;

public class ConcreteProdutosDigitais implements DescontoEstrategia{
    @Override
    public double getDesconto() {
        return 0.15;
    }
}
