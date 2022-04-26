package atv01.questao13;

public class Movimentacao {
    private double valor;
    //private Conta conta;
    //private Calendar data;

    public double getEncargos() {
        return valor * 0.01;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
