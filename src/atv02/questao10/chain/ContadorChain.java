package atv02.questao10.chain;

public abstract class ContadorChain {

    public ContadorChain nextContador;

    public ContadorChain(ContadorChain nextContador) {
        this.nextContador = nextContador;
    }

    public abstract String Contar(double valor);

}
