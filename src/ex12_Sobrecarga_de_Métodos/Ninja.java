package ex12_Sobrecarga_de_Métodos;

public class Ninja {
    private String nome;
    private int chakra;


    public Ninja(String nome, int chakra) {
        this.nome = nome;
        this.chakra = chakra;
    }


    public void atacar() {
        if ( this.chakra < 10 ) {
            System.out.println("Quantidade de chakra insuficiente!");
        } else {
            this.chakra -= 10;
            System.out.println(nome + " - Atacou com uma Kunai" +  ", gastou: " + " 10" + " de chakra" + ", Restou:" + this.chakra);

        }

    }

    public void atacar(String itemNinja, int  danoInimigo) {
        if (this.chakra < danoInimigo) {
            System.out.println("Chakra insuficiente");
        } else {
            this.chakra -= danoInimigo;
            System.out.println( nome + " - Ataca voce com churiken! "+ ", ataque casou dano: " + danoInimigo + " no inimigo" + "Restou:" +  this.chakra);
        }
    }


    public void atacar(String jutsu, int gastoChakra, int danoInimigo) {
       if (this.chakra < gastoChakra) {
           System.out.println("Chakra insuficiente!");
       } else {
           this.chakra -= gastoChakra;
           System.out.println( nome + " - Ataca voce com shidori! " + ", gastou: " + gastoChakra + " de Chakra "+  ", Restou:" + this.chakra + " E causou: " + danoInimigo + " Dano ao inimigo");
       }
    }
}



