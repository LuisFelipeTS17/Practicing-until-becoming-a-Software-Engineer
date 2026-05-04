package ex16_Polimorfismo;

public class FuncionarioComecionado extends Funcionario{
    double porcentagemComissao;
    public FuncionarioComecionado(String nome, String matricula, double salarioBase, double porcentagemComissao) {
        super(nome, matricula, salarioBase);
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public double calcularSalarioLiquido() {

        return getSalarioBase() + ( getSalarioBase() * porcentagemComissao);
    }


}
