package ex04_Tabela_de_Ranks_Ninja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] rankNinja = new String[5];
        rankNinja[0] = "Genin";
        rankNinja[1] = "Chunin";
        rankNinja[2] = "Jonin";
        rankNinja[3] = "ANBU";
        rankNinja[4] = "Hokage";

        for (int i = 0; i < rankNinja.length; i++) {
            System.out.println((i + 1) + " - " + rankNinja[i]);
        }
        System.out.print("Digte o numero do rank do Ninja: ");
        int indexArray = sc.nextInt();

        if (indexArray >= 0 && indexArray <= 4) {
            System.out.println("Sua opção foi: " + rankNinja[indexArray]);
        } else {
            System.out.println("Opção invalida!");
        }
    }
}

