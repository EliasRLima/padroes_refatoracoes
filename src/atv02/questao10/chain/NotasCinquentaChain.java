package atv02.questao10.chain;

public class NotasCinquentaChain extends ContadorChain{

    public NotasCinquentaChain() {
        super(new NotasVinteChain());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 50){
            return "\nNotas de 50: " + (int)(valor/50) + this.nextContador.Contar(valor%50);
        }else{
            return this.nextContador.Contar(valor%50);
        }

    }
}
