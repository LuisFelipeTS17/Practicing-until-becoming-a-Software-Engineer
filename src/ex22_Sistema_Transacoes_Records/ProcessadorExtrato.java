package ex22_Sistema_Transacoes_Records;

public class ProcessadorExtrato {

    public void exibirExtrato(Extrato extrato) {
        System.out.println("Nome: "+ extrato.cliente().nome());
        System.out.println("CPF: " +extrato.cliente().cpf());

        for (Transacao transacao : extrato.transacoes())
        System.out.println("ID da sua trasação: " + transacao.id() + " Valor da Transação: " + transacao.valor());
    }
}
