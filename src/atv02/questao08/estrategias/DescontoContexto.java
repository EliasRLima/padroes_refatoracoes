package atv02.questao08.estrategias;

public class DescontoContexto {

    private DescontoEstrategia descontoEstrategia;

    public void setDescontoEstrategia(DescontoEstrategia descontoEstrategia) {
        this.descontoEstrategia = descontoEstrategia;
    }

    public double executa(){
        return this.descontoEstrategia.getDesconto();
    }
}
