package atv02.Questao11.chain;

import atv02.Questao11.Conta;
import atv02.Questao11.Formato;
import atv02.Questao11.Requisicao;

public class FormatoJSON extends FormatoChain{

    public FormatoJSON() {
        super(new FormatoXML());
    }

    @Override
    public boolean formatoCerto(Requisicao requisicao) {
        if(requisicao.getFormato() == Formato.JSON) {
            return true;
        }
        return false;
    }

    @Override
    public String getFormatado(Requisicao requisicao, Conta conta) {
        if(formatoCerto(requisicao)){
            String formatoJson = "{\n";
            formatoJson += "\tnumero: " + conta.getNumero() + ",\n";
            formatoJson += "\tsaldo: " + conta.getSaldo() + "\n}";
            return  formatoJson;
        }else{
            if(this.nextFormato != null){
                return this.nextFormato.getFormatado(requisicao, conta);
            }else{
                return "Formato nao localizado.";
            }
        }

    }
}
