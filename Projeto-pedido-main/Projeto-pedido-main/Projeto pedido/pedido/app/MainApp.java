package app;

import pedido.Cliente;
import pedido.Produto;
import pedido.Item;
import pedido.Pedido;

public class MainApp {
    public static void main(String[] args) {

        Pedido p1 = criarPedido();
        System.out.println(p1.getCliente().getNome());
    }

    public static Pedido criarPedido(){
        Cliente Luis = new Cliente();
        Luis.setId(1l);
        Luis.setNome("Luis");

        Produto chocolate = new Produto();
        chocolate.setNome("Diamante negro");
        chocolate.setValor(7.90f);

        Produto pizza = new Produto();
        pizza.setNome("Pizza de calabresa");
        pizza.setValor(79.90f);

        Item item1 = new Item();
        item1.setProduto(chocolate);
        item1.setQde(100);
        Item item2 = new Item();
        item2.setProduto(pizza);
        item2.setQde(100);

        Pedido pedido1 = new Pedido();
        pedido1.setId(1l);
        pedido1.setCliente(Luis);
        pedido1.addItem(item1);
        pedido1.addItem(item2);

        return pedido1;
    } 
}
