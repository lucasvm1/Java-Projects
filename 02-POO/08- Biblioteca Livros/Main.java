public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Mémorias Póstumas de Brás Cubas", "Machado de Assis");
        Livro livro1 = new Livro("A Hora da Estrela", "Clarice Lispector");

        Biblioteca biblioteca = new Biblioteca("Fundação Biblioteca Nacional");

        biblioteca.listarLivrosDisponiveis();

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro1);

        livro.emprestar();

        biblioteca.listarLivrosDisponiveis();

    }
}
