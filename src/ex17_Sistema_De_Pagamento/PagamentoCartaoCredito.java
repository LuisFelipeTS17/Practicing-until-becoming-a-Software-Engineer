package ex17_Sistema_De_Pagamento;

public class PagamentoCartaoCredito extends  Pagamento{
    static final double TAXA_CARTAO_CREDITO = 0.0299;
    private int numeroParcelas;

    public PagamentoCartaoCredito(int id, double valor, String descricao, int numeroParcelas) {
        super(id, valor, descricao);
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double calcularTaxa(){
        return  getValor() * TAXA_CARTAO_CREDITO;
    }
}
