package ex13_Classe_Metodos_Final;

public class Main {
    public static void main(String[] args) {
    Jutsu rasegan = new Jutsu("Rasegan", 1000);
    Chidori chidori = new Chidori("Chidori", 500);
        /**
         * Classe final Rasengan não pode ser herdada porque o modificador final impede
         * que outras classes usem extends Rasengan.
         * Isso garante que a implementação de Rasengan não pode ser alterada por subclasses.
         *
         * Não posso colocar final calcularDano,pois o final nao permite ser sobreescrito
         *
         */


    }
}
