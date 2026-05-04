package ex16_Polimorfismo;

public class FuncionarioCLT extends Funcionario{
    double calcularDescontoINSS;
    public FuncionarioCLT(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalarioLiquido() {
      return getSalarioBase() - (getSalarioBase() * 0.11);
    }


}
