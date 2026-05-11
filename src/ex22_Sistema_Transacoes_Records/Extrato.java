package ex22_Sistema_Transacoes_Records;

import java.util.List;

public record Extrato(Cliente cliente, List<Transacao> transacoes) {
}
