package ex15_heranca;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor felipe = new Desenvolvedor("Felipe", 100000, "Java");
        felipe.calcularSalario();
        felipe.mostrarSalarioBase();

        Gerente joao = new Gerente("Joao", 1000, 4);
        joao.conduzirReuniao();

        Funcionario kaique = new Funcionario("Kaique", 1000);
        kaique.calcularSalario();
    }
}
