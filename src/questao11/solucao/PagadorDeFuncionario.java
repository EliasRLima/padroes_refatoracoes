package questao11.solucao;

import java.util.Scanner;

public class PagadorDeFuncionario {

    public static void main(String[] args) {

        Contexto context = new Contexto();
        int escolha;
        System.out.println("1 - PagarChefe\n2 - PagarFuncionario\n3 - PagarEstagiario\nEscolha: ");
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();

        if (escolha == 1){
            context.setStrategy(new ConcretePagaChefe());
        }else if(escolha == 2){
            context.setStrategy(new ConcretePagaFuncionario());
        }else if(escolha == 3){
            context.setStrategy(new ConcretePagaEstagiario());
        }else{
            return;
        }

        context.executaStrategy();
    }
}
