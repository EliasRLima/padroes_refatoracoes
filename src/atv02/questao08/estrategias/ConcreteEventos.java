package atv02.questao08.estrategias;

public class ConcreteEventos implements DescontoEstrategia{

    private double desconto;

    public ConcreteEventos(double desconto){
        this.desconto = desconto;
    }

    @Override
    public double getDesconto() {
        return this.desconto;
    }
}
