public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos

    public void adicionaEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
    public void removerEstoque(int quantidade) {
        if (this.quantidadeEstoque > quantidade) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Não há produtos o suficiente no estoque!\n" +
                    "Estoque: " + this.quantidadeEstoque);
        }
    }

}
