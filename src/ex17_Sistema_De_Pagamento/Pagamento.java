package ex17_Sistema_De_Pagamento;

public abstract class Pagamento {
    private int id;
    private double valor;
    private String descricao;

    public Pagamento(int id, double valor, String descricao) {
        this.id = id;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularTaxa();

    public double calcularValorFinal(){
        return getValor() + calcularTaxa();
    }

    public void exibirResumo() {
        System.out.printf("Pagamento realizado com Sucesso! R$ %.2f%n" , calcularValorFinal());
    }
}
