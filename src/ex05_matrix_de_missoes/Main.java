package ex05_matrix_de_missoes;

public class Main {
    public static void main(String[] args) {
        int contarMissoes = 0;
        String[][] missoes = new String[3][3];
        missoes[0][0] = "Salvar gato do Hokage";
        missoes[0][1] = "Explorar a vila da folha";
        missoes[0][2] = "Verificar exame chunnin";

        missoes[1][0] = "Espionar vila da chuva";
        missoes[1][1] = "Ver treinamento Anbu";
        missoes[1][2] = "Ver Naruto";

        missoes[2][0] = "Proteger Hokage";
        missoes[2][1] = "Verificar Orochimaru";
        missoes[2][2] = "Curar feridos da vila";


        for (int i = 0; i < missoes.length ; i++) {
            System.out.println("Time " + (i + 1) + ":");
        for (int j = 0; j < missoes[i].length; j++) {
            System.out.println(" - " + missoes[i][j]);
            contarMissoes++;
            }
        }
        System.out.println("Quantidade de missões:" + contarMissoes);

    }
}
