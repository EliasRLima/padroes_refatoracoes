package atv01.questao12;

public class ConcreteInvestirArrojado implements InvestimentoStrategy{
    @Override
    public double investir(double valor) {
        int resultado = RandomService.getInstancia().getNumeroAleatorio();
        if(resultado > 80){ //20%
            return valor*0.05;
        }else if(resultado > 50){
            return valor*0.03;
        }
        return valor*0.006;
    }
}
