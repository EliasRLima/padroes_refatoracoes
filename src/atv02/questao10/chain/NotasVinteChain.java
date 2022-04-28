package atv02.questao10.chain;

public class NotasVinteChain extends ContadorChain{

    public NotasVinteChain() {
        super(new NotasDezChain());
    }

    @Override
    public String Contar(double valor) {
        if(valor >= 20){
            return "\nNotas de 20: " + (int)(valor/20) + this.nextContador.Contar(valor%20);
        }else{
            return this.nextContador.Contar(valor%20);
        }

    }
}
