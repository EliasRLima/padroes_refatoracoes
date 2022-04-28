package atv02.questao10.chain;

public class NotasDoisChain extends ContadorChain{

    public NotasDoisChain() {
        super(null);
    }

    @Override
    public String Contar(double valor) {
        return "\nNotas de 2: " + (int)(valor/2);
    }
}
