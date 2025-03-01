public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Refrigerante", 9.99, 5);

        produto.adicionaEstoque(10);
        System.out.println(produto.getQuantidadeEstoque());
        produto.removerEstoque(25);


    }
}
