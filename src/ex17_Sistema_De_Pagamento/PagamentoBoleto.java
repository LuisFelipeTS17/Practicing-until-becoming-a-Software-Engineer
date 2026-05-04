package ex17_Sistema_De_Pagamento;

public class PagamentoBoleto extends Pagamento {
    static final double TAXA_BOLETO = 3.50;

    public PagamentoBoleto(int id, double valor, String descricao) {
        super(id, valor, descricao);
    }

    @Override
    public double calcularTaxa(){
        return TAXA_BOLETO;
    }

}
