public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Lucas");

        Item item1 = new Item("Sabão", 2.99, 5);
        Item item2 = new Item("Maçãa", 3.99, 10);
        Item item3 = new Item("Pera", 5.99, 7);

        Pedido pedido = new Pedido(142, cliente);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        pedido.calcularTotal();





    }
}
