package atv01.questao13;

public class Deposito {
    private String numeroEnvelope;
    private Movimentacao movimentacao;

    public Deposito(String numeroEnvelope, Movimentacao movimentacao) {
        this.numeroEnvelope = numeroEnvelope;
        this.movimentacao = movimentacao;
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

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
