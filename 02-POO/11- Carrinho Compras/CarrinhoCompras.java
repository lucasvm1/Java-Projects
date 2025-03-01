import java.util.ArrayList;

public class CarrinhoCompras {

    private Usuario usuario;
    private ArrayList<Produto> produtos = new ArrayList<>();

    CarrinhoCompras(Usuario usuario) {
        this.usuario = usuario;
    }

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    double calcularPreco() {
        double preco = 0;
        for (Produto produto : produtos) {
            preco += produto.getPreco();
        }
        return preco;
    }

}
