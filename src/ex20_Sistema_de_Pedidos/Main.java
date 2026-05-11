package ex20_Sistema_de_Pedidos;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(01, "Rógerio");
        pedido1.adicionarItem(new ItemPedido("Bolsa", 50, 40.00));

        Pedido pedido2 = new Pedido(02,  "Marcia");
        pedido2.adicionarItem(new ItemPedido("Rélogio", 90, 350));
        pedido2.adicionarItem(new ItemPedido("Bolsa", 10, 590));

        pedido1.exibirPedido();
        pedido2.exibirPedido();
    }
}
