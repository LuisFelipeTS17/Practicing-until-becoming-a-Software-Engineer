package ex11_Sobrecarga_Construtores;

public class Main {
    public static void main(String[] args) {
        ContaDigital conta1 = new ContaDigital("Luis Felipe", "0001", 1000);
        ContaDigital conta2 = new ContaDigital("Rodrigo", "0002");
        ContaDigital conta3 = new ContaDigital("Reginaldo");

        conta1.exibirDados();
        conta2.exibirDados();
        conta3.exibirDados();

    }

}
