package ex14_Referencia_Valor;

public class Utilitario {
    public static void tentarAlterar(int numero) {
        numero = 999;
        System.out.println("Valor Depois: " + numero);
    }

    public static void alterarNome(Ninja ninja) {
        ninja.nome = "Kakashi Uchiha";
        System.out.println("Dentro do método:" + ninja.nome);
    }
}
