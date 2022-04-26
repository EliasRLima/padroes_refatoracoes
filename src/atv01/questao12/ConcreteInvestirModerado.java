package atv01.questao12;

public class ConcreteInvestirModerado implements InvestimentoStrategy{
    @Override
    public double investir(double valor) {
        int resultado = RandomService.getInstancia().getNumeroAleatorio();
        if(resultado > 50){
            return valor*0.025;
        }
        return valor*0.007;
    }
}
