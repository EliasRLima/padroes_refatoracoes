package atv02.questao10.chain;

public class NotasDezChain extends ContadorChain{

    public NotasDezChain() {
        super(new NotasCincoChain());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 10){
            return "\nNotas de 10: " + (int)(valor/10) + this.nextContador.Contar(valor%10);
        }else{
            return this.nextContador.Contar(valor%10);
        }

    }
}
