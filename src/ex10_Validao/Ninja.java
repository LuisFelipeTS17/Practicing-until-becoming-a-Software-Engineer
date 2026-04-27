package ex10_Validao;

public class Ninja {
    private String nome;
    private int idade;
    private int chakra;
    

    public Ninja(String nome, int idade, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.chakra = chakra;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getChakra() {
        return chakra;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
            return; // Boas praticas tambem, funciona como um else sem necessariamente usar
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 100) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public void setChakra(int chakra) {
        if (chakra < 0 ) {
            System.out.println("Chakra não pode ser negativo!");
            return;
        } else if (chakra > 1000) {
            System.out.println("Chakra máximo é 1000! Ajustando....");
            chakra = 1000;

        }
        this.chakra = chakra;
    }

    public void exibirDados() {
        System.out.println("Nome:" + getNome());
        System.out.println("Idade:" + getIdade());
        System.out.println("Chakra:" + getChakra());
    }

}
