package atv02.questao10.chain;

public class NotasCemChain extends ContadorChain{

    public NotasCemChain() {
        super(new NotasCinquentaChain());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 100){
            return "\nNotas de 100: " + (int)(valor/100) + this.nextContador.Contar(valor%100);
        }else{
            return this.nextContador.Contar(valor%100);
        }
    }
}
