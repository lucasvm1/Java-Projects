import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        boolean todosEmprestados = true;
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println("Livro: " + livro.getTitulo() + " - " + livro.getAutor());
                todosEmprestados = false;
            }
        }

        if (todosEmprestados) {
            System.out.println("Não há livros disponíveis!");
        }

    }

}
