package ex17_Sistema_De_Pagamento;

public class PagamentoPix extends Pagamento{
    public PagamentoPix(int id, double valor, String descricao) {
        super(id, valor, descricao);
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

}
