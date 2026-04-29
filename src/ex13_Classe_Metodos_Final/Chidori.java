package ex13_Classe_Metodos_Final;

public class Chidori extends Jutsu{

    public Chidori(String nome, int nivelChakra) {
        super(nome, nivelChakra);
    }

    @Override
    public void executar() {
        System.out.println("Executar Jutsu!");
    }


}
