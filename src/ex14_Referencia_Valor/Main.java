package ex14_Referencia_Valor;

public class Main {
    public static void main(String[] args) {
      int valor = 10;
      System.out.println("Antes: " + valor);
        //Primitivo passa cópia
        Utilitario.tentarAlterar(valor);

        System.out.println("Depois: " + valor);

        //Objeto passa a referencia
        Ninja sasuke = new Ninja();
        System.out.println("Antes: " + sasuke.nome);


        Utilitario.alterarNome(sasuke);
        System.out.println("Depois: " + sasuke.nome);

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        // Atribuicao cria segunda referencia
        Ninja copia = naruto;
        copia.nome = "Sasuke";

        System.out.println("naruto.nome = " + naruto.nome);
        System.out.println("copia = " + copia.nome);

    }
}
