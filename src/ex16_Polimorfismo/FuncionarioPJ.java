package ex16_Polimorfismo;

public class FuncionarioPJ extends Funcionario{
    private double salarioAcrescimo;

    public FuncionarioPJ(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalarioLiquido() {
        return getSalarioBase() + (getSalarioBase() * 0.15);
    }

}
