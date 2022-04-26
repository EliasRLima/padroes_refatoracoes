package atv01.questao12;

import java.util.Scanner;

public class AppInvestir {
    public static void main(String[] args) {
        ContextoInvestir contexto = new ContextoInvestir();
        double valor;
        int escolha;

        System.out.println("1 - Perfil conservador\n2 - Perfil moderado\n3 - Perfil arrojado\nEscolha: ");
        Scanner scanner = new Scanner(System.in);
        escolha = scanner.nextInt();

        System.out.println("Valor investido: \n");
        valor = scanner.nextDouble();

        if(escolha==1){
            contexto.setStrategy(new ConcreteInvestirConservador());
        }else if(escolha==2){
            contexto.setStrategy(new ConcreteInvestirModerado());
        }else if(escolha==3){
            contexto.setStrategy(new ConcreteInvestirArrojado());
        }else{
            return;
        }

        double resultado = contexto.executaStrategy(valor);
        System.out.println("Resultado: "+ resultado);

    }
}
