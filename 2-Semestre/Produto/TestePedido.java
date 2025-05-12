package Produto;

public class TestePedido {
    public static void main(String[] args) {
        Pedido umPedido = new Pedido(1, "jao");
        umPedido.adicionarItemAoPedido(1, "xsalada", 14.01);
        umPedido.adicionarItemAoPedido(1, "xsalada", 14.01);
    }
}
