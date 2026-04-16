package exerc02_Simulador_De_Caixa_Eletronico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolhaUsuario;
        double saldo = 1000;
        double deposito, saque;
        Scanner sc = new Scanner(System.in);

        System.out.println("============Bem vindo ao Banco============");
        System.out.println("(1) - Saldo");
        System.out.println("(2) - Depósito");
        System.out.println("(3) - Saque");
        System.out.println("(4) - Sair");

        System.out.println("Digite uma opção: ");
        escolhaUsuario = sc.nextInt();

        switch (escolhaUsuario) {
            case 1: {
                System.out.println("Seu saldo atual é: R$ " + saldo );
                break;
            }
            case  2: {
                System.out.println("Valor do deposito: ");
                deposito = sc.nextDouble();

                saldo += deposito;
                System.out.println("Seu Saldo atual é: R$ " + saldo);
                break;

            }
            case 3: {
                System.out.println("Valor do Saque: R$ " );
                saque = sc.nextDouble();

                if (saque <= 0) {
                    System.out.println("Valor invalido. Digite um valor maior que zero.");
                } else if (saque > saldo) {
                    System.out.println("Saldo insuficiente ");
                } else {
                    saldo -= saque; // saldo = saque - saldo
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                }
                break;

            }
            case 4: {
                System.out.println("Saindo da aplicação!" );
                break;

            } default:
                System.out.println("Resposta invalida, voltando ao menu.");
        }
    }
}
