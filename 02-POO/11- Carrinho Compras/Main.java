public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Sabão", 3.99);
        Produto produto2 = new Produto("Arroz", 7.99);
        Produto produto3 = new Produto("Feijão", 5.99);

        Usuario usuario = new Usuario(1, "Lucas");

        CarrinhoCompras carrinho = new CarrinhoCompras(usuario);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        System.out.println("Total do carrinho: R$" + carrinho.calcularPreco());

        carrinho.removerProduto(produto1);

        System.out.println("Total do carrinho: R$" + carrinho.calcularPreco());


    }
}
