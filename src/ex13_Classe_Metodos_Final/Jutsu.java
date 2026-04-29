package ex13_Classe_Metodos_Final;

public class Jutsu {
   private String nome;
    private int nivelChakra;

    public void executar() {
        System.out.println("Executar Jutsu!");
    }

    public Jutsu(String nome, int nivelChakra) {
        this.nome = nome;
        this.nivelChakra = nivelChakra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelChakra() {
        return nivelChakra;
    }

    public void setNivelChakra(int nivelChakra) {
        this.nivelChakra = nivelChakra;
    }

    public final void calcularDano() {
        System.out.println("Você recebeu um dano!");
    }
}
