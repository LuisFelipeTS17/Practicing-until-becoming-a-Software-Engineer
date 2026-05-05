package ex17_Sistema_De_Pagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new PagamentoBoleto(10, 230, "Conta de água"));
        pagamentos.add(new PagamentoPix(1, 150, "Pagamento restaurante"));
        pagamentos.add(new PagamentoCartaoCredito(2,540, "Pagamento parcelado", 5 ));

        for (Pagamento  pagamento : pagamentos) {
            pagamento.exibirResumo();
        }
    }
}
