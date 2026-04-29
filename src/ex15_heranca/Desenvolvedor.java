package ex15_heranca;

public class Desenvolvedor extends Funcionario{
    String linguagemPrincipal;

    public Desenvolvedor(String nome, double salarioBase, String linguagemPrincipal) {
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double calcularBonus = getSalarioBase() * 1.15;
        System.out.printf("Salário com Bônus: R$ %.2f%n", calcularBonus);
    }


    public void mostrarSalarioBase() {
        System.out.printf("Salário: R$ %.2f%n", this.getSalarioBase());
    }

    public void programar() {
        System.out.println(getNome() + "está programando agora!");
    }
}
