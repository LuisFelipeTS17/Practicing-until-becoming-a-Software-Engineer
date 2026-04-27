package ex10_Validao;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", 80, 1000);
        naruto.setNome("");
        naruto.setChakra(-500);
        naruto.setIdade(150);

        naruto.exibirDados();
    }
}
