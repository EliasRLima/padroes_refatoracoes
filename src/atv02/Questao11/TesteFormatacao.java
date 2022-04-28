package atv02.Questao11;

import atv02.Questao11.chain.ChainFormatoController;

public class TesteFormatacao {

    public static void main(String[] args) {
        ChainFormatoController formatador = new ChainFormatoController();

        Conta conta = new Conta(1234, 2300);
        Requisicao requisicaoJson = new Requisicao(Formato.JSON);
        Requisicao requisicaoCSV = new Requisicao(Formato.CSV);
        Requisicao requisicaoXML = new Requisicao(Formato.XML);

        System.out.println("Formato JSON: \n" + formatador.getFormatado(requisicaoJson, conta));
        System.out.println("\nFormato CSV: \n" + formatador.getFormatado(requisicaoCSV, conta));
        System.out.println("\nFormato XML: \n" + formatador.getFormatado(requisicaoXML, conta));

    }
}
