package questao13;

public class Deposito {
    private String numeroEnvelope;
    private Movimentacao movimentacao;

    public Deposito(String numeroEnvelope, double valor) {
        this.numeroEnvelope = numeroEnvelope;
        movimentacao = new Movimentacao();
        movimentacao.setValor(valor);
    }

    public String getNumeroEnvelope() {
        return numeroEnvelope;
    }

    public void setNumeroEnvelope(String numeroEnvelope) {
        this.numeroEnvelope = numeroEnvelope;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    private void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
