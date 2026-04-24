package ex08_Tabuada_dinamica_com_Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while (opcao != 2) {

            System.out.println("==== Tabuada ====");
            System.out.println("(1) - Exibir Tabuada");
            System.out.println("(2) - Sair");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Digite um número: ");
                    int num = sc.nextInt();
                    int resultado;
                    for (int i = 1; i < 11; i++) {
                        resultado = num * i;
                        System.out.print(num + " x " + i + " = " + resultado);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Saindo do menu!");
                    break;
                }
                default:
                    System.out.println("Nenhuma opção selecionada");
            }
        }
    }
}
