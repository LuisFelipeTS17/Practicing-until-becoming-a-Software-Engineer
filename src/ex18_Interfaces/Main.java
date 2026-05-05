package ex18_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notificavel> notificacoes = new ArrayList<>();

        notificacoes.add(new NotificacaoEmail("Eric Kaique", "Retorno sobre refaturação de projeto!"));
        notificacoes.add(new NotificacaoSMS("1199393929392"));
        notificacoes.add(new NotificacaoPush("0123124"));

        for (Notificavel notificavel : notificacoes) {
            notificavel.enviar("Está tudo bem ai? ");
        }
    }
}
