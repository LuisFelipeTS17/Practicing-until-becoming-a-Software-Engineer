package ex03_calculadora_Juros_Compostos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double montanteFinal, capitalInicial, taxaDeJuros;
        int tempoDeAplicacao;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do Capital Inicial: ");
        capitalInicial = scanner.nextDouble();

        System.out.print("Digite o periodo em anos: ");
        tempoDeAplicacao = scanner.nextInt();

        System.out.print("Digite a Taxa de Juros: ");
        taxaDeJuros = scanner.nextDouble();
        taxaDeJuros = taxaDeJuros / 100;

        montanteFinal =capitalInicial * Math.pow(1 + taxaDeJuros, tempoDeAplicacao);

        //Ternario
        String verificacaoTempo = ( tempoDeAplicacao <= 12) ? "Sua aplicação é de curto prazo" : "Sua aplicação é de longo prazo";
        System.out.println(verificacaoTempo);

        System.out.print("Seu montante ao final de " + tempoDeAplicacao + " anos");
        System.out.printf(" é: R$ %.2f%n", montanteFinal );

    }
}
