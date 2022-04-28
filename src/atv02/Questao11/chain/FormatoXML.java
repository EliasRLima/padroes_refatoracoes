package atv02.Questao11.chain;

import atv02.Questao11.Conta;
import atv02.Questao11.Formato;
import atv02.Questao11.Requisicao;

public class FormatoXML extends FormatoChain{

    public FormatoXML() {
        super(new FormatoCSV());
    }

    @Override
    public boolean formatoCerto(Requisicao requisicao) {
        if(requisicao.getFormato() == Formato.XML) {
            return true;
        }
        return false;
    }

    @Override
    public String getFormatado(Requisicao requisicao, Conta conta) {
        if(formatoCerto(requisicao)){
            String formatoXML = "<conta>\n";
            formatoXML += "\t<numero>" + conta.getNumero() + "</numero>\n";
            formatoXML += "\t<saldo>" + conta.getSaldo() + "</saldo>\n</conta>";
            return  formatoXML;
        }else{
            if(this.nextFormato != null){
                return this.nextFormato.getFormatado(requisicao, conta);
            }else{
                return "Formato nao localizado.";
            }
        }
    }
}
