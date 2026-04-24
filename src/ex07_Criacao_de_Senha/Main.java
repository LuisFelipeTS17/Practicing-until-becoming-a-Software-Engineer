package ex07_Criacao_de_Senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String senhaUsuario, confirmarSenha;
        int numeroTentativas = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha com 8 Caracteres(minimo): ");
        senhaUsuario = sc.nextLine();

        while (senhaUsuario.length() < 8 ) {
            System.out.println("Digite uma senha com 8 Caracteres(minimo): ");
            senhaUsuario = sc.nextLine();

            }
        System.out.println("Confirme a sua senha: ");
        confirmarSenha = sc.nextLine();

        while (!confirmarSenha.equals(senhaUsuario) && numeroTentativas > 0 ) {
            System.out.println("Senha incorreta! Digite Novamente " + "(você tem mais: " + numeroTentativas + " tentativas)");
            confirmarSenha = sc.nextLine();
            numeroTentativas--;
        }

        if (confirmarSenha.equals(senhaUsuario)) {
            System.out.println("Senha confirmada com sucesso!");
        } else {
            System.out.println("Conta bloqueada por excesso de tentativas");
        }

        }
    }

