package ex01_classificador_chakra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        double nivelDeChakra;
        boolean vivoOuMorto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu Ninja: ");
        nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Qual o seu nivel de chakra?");
        nivelDeChakra = scanner.nextDouble();

        // Limpa o ENTER pendente antes de ler texto novamente
        scanner.nextLine();

        if (nivelDeChakra < 50) {
            System.out.println("Você é fraco!");
        } else if (nivelDeChakra <= 150) {
            System.out.println("Seu nivel de chakra é moderado!");
        } else {
            System.out.println("Você é muito Poderoso!!");
        }

        System.out.println("Seu Ninja esta vivo? (sim/nao)");
        String situacaoReal = scanner.nextLine();
        vivoOuMorto = situacaoReal.equalsIgnoreCase("sim");

        if (vivoOuMorto) {
            System.out.println("Você é um Ninja e está vivo");
        } else {
            System.out.println("O Ninja está morto!");
        }

        scanner.close();
    }
}
