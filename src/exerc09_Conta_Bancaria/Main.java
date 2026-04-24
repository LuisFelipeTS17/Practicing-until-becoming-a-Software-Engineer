package exerc09_Conta_Bancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria felipe = new ContaBancaria("Felipe", "0001", 1000);
        ContaBancaria rodrigo = new ContaBancaria("Rodrigo", "0002", 500);


        felipe.depositar(1000);
        felipe.depositar(500);

        felipe.sacar(5000);
        felipe.exibirDados();

        rodrigo.exibirDados();
        rodrigo.depositar(100);
        rodrigo.sacar(-5000);

    }
}
