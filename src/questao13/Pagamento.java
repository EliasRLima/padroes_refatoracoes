package questao13;

public class Pagamento {
    private String favorecido;
    private String formaDePagamento;
    private Movimentacao movimentacao;

    public Pagamento(String favorecido, String formaDePagamento, Movimentacao movimentacao) {
        this.favorecido = favorecido;
        this.formaDePagamento = formaDePagamento;
        this.movimentacao = movimentacao;
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

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
