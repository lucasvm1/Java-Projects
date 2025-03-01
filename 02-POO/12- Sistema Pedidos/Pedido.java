import java.util.ArrayList;

public class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private ArrayList<Item> itens = new ArrayList();

    public Pedido(int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
    }

    //Get Set
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos

    void adicionarItem(Item item) {
        itens.add(item);
    }

    void removerItem(Item item) {
        itens.remove(item);
    }

    void calcularTotal() {
        double total = 0;
        System.out.printf("Lista de compras cliente %d - %s\n\n", this.cliente.getIdCliente(), this.cliente.getNome());
        for (Item item : itens) {
            item.exibirInfo();
            total += (item.getPreco() * item.getQuantidade());
        }

        System.out.println("\nTotal de compras: R$" + total);
    }


}
