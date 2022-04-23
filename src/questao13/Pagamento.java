package questao13;

public class Pagamento {
    private String favorecido;
    private String formaDePagamento;
    private Movimentacao movimentacao;

    public Pagamento(String favorecido, String formaDePagamento, double valor) {
        this.favorecido = favorecido;
        this.formaDePagamento = formaDePagamento;
        this.movimentacao = new Movimentacao();
        this.movimentacao.setValor(valor);
    }

    public String getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    private void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
