package atv02.questao10.chain;

public class NotasCincoChain extends ContadorChain{

    public NotasCincoChain() {
        super(new NotasDoisChain());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 5){
            return "\nNotas de 5: " + (int)(valor/5) + this.nextContador.Contar(valor%5);
        }else{
            return this.nextContador.Contar(valor%5);
        }

    }
}
