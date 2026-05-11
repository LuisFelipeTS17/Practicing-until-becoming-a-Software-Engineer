package ex20_Sistema_de_Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int numeroPedido;
    String cliente;


    List<ItemPedido> itens;

    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens =  new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularSubTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itens) {
           total += itemPedido.calcularSubTotal();
        }
        return total;

    }
    public void exibirPedido() {
        System.out.println("Numero do Pedido: " + numeroPedido );
        System.out.println("Nome do Cliente: " + cliente);

       for (ItemPedido itemPedido : itens){
           System.out.println("Quantidade: " + itemPedido.quantidade);
           System.out.println("Subtotal: R$ " + itemPedido.calcularSubTotal());
       }
        System.out.println("Total Geral: R$ " + calcularSubTotal() );
    }


}
