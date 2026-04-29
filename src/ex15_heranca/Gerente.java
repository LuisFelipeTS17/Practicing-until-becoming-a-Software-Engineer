package ex15_heranca;

public class Gerente extends Funcionario{
    private int numeroEquipe;

    public int getNumeroEquipe() {
        return numeroEquipe;
    }

    public void setNumeroEquipe(int numeroEquipe) {
        this.numeroEquipe = numeroEquipe;
    }

    public Gerente(String nome, double salarioBase, int numeroEquipe) {
        super(nome, salarioBase);
        this.numeroEquipe = numeroEquipe;
    }

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public void calcularSalario() {
        double calcularBonus = getSalarioBase() * 1.20;
        System.out.printf("Sálario com Bônus:R$ %.2f", calcularBonus);
    }

    public void mostrarSalarioBase() {
        System.out.printf("Salário: R$ %.2f%n", this.getSalarioBase());
    }

    public void conduzirReuniao() {
        System.out.println(getNome() + " está conduzindo uma reuniao!" + " Equipe: " + getNumeroEquipe() );
    }

}
