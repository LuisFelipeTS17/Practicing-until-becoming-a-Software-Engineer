package exerc06_Extrato_Bancario_mensal;

public class Main {
    public static void main(String[] args) {
        double totalEntradas = 0;
        double totalSaidas = 0;
        double saldoFinal = 0;

        String[] descricao = new String[8];
        descricao[0] = "Salário";
        descricao[1] = "Aluguel";
        descricao[2] = "Mercado";
        descricao[3] = "Pix recebido - João";
        descricao[4] = "Uber";
        descricao[5] = "Netflix";
        descricao[6] = "Restaurante";
        descricao[7] = "Freelance";

        double[] valores = new double[8];
        valores[0] = 3500;
        valores[1] = -1200;
        valores[2] = -450;
        valores[3] = 200;
        valores[4] = -35;
        valores[5] = -55;
        valores[6] = -80;
        valores[7] = 800;

        System.out.println("============= EXTRATO DO MÊS ==============");
        for (int i = 0; i < descricao.length; i++) {
            System.out.print(descricao[i] + ":");

            if (valores[i] > 0) {
                System.out.printf("[ENTRADA] R$ %.2f%n" , valores[i]);
                totalEntradas += valores[i];
            } else {
                double valortotal = Math.abs(valores[i]);
                totalSaidas += valores[i];
                System.out.printf("[SAIDA] R$%.2f%n" , valortotal);
            }
            saldoFinal += valores[i];
        }

        System.out.println();
        System.out.println("========== RESUMO DO MES ==============");
        System.out.printf("total de entradas: R$%.2f%n " , totalEntradas);
        System.out.printf("total de saidas: R$%.2f%n ", Math.abs(totalSaidas));
        System.out.printf("Saldo Final desse mês:R$%.2f%n " , saldoFinal);
        System.out.println("=======================================");
    }
}
