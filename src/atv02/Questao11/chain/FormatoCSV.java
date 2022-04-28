package atv02.Questao11.chain;

import atv02.Questao11.Conta;
import atv02.Questao11.Formato;
import atv02.Questao11.Requisicao;

public class FormatoCSV extends FormatoChain{

    public FormatoCSV() {
        super(null);
    }

    @Override
    public boolean formatoCerto(Requisicao requisicao) {
        if(requisicao.getFormato() == Formato.CSV) {
            return true;
        }
        return false;
    }

    @Override
    public String getFormatado(Requisicao requisicao, Conta conta) {
        if(formatoCerto(requisicao)){
            String formatoCSV = conta.getNumero() + "%" + conta.getSaldo();
            return  formatoCSV;
        }else{
            if(this.nextFormato != null){
                return this.nextFormato.getFormatado(requisicao, conta);
            }else{
                return "Formato nao localizado.";
            }
        }
    }
}
