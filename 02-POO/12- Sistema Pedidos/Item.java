public class Item {

    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInfo() {
        System.out.printf("Item: %s | Preço: R$ %.2f | Quantidade: %d | Valor Total: R$%.2f\n", nome, preco, quantidade, (quantidade * preco));
    }


}
