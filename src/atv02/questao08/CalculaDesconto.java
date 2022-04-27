package atv02.questao08;

import atv02.questao08.estrategias.ConcreteEventos;
import atv02.questao08.estrategias.DescontoContexto;
import atv02.questao08.estrategias.DescontoEstrategia;

public class CalculaDesconto {

    private DescontoContexto descontoContexto;

    //o metodo calcular funciona para todos os produtos
    public double calcular(double valorOriginal){
        return valorOriginal - (valorOriginal * descontoContexto.executa());
    }

    //é possivel passar desconto especial, dessa forma é considerado como evento
    public double calcular(double valorOriginal,double descontoEspecial){
        descontoContexto.setDescontoEstrategia(new ConcreteEventos(descontoEspecial));
        //apenas salva o desconto, colocando contexto como evento e executa normalmente
        return calcular(valorOriginal);
    }

    //passando o produto como se tivesse sem evento ativo (preço classico de desconto)
    public double calcular(double valorOriginal, DescontoEstrategia descontoEstrategia){
        descontoContexto.setDescontoEstrategia(descontoEstrategia);
        return calcular(valorOriginal);
    }
}
