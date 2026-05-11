package ex22_Sistema_Transacoes_Records;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "345.456.354-9");
        Transacao cartao = new Transacao(001, 3500, "PIX", "Pagamento de PC GAMER");

        List<Transacao> transacoes = new ArrayList<>();
        transacoes.add(cartao);
        Extrato mes1 = new Extrato(pedro,transacoes);

        ProcessadorExtrato total = new ProcessadorExtrato();
        total.exibirExtrato(mes1);
        System.out.println(cartao.descricao());


    }
}
