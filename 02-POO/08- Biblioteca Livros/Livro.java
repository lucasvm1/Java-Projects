public class Livro {

    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    // Getters & Setters

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Métodos
    void emprestar() {
        if (emprestado) {
            System.out.println("O livro já está emprestado!");
        } else {
            emprestado = true;
            System.out.println("Você pegou o livro!");
        }
    }

    void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("O livro não está emprestado!");
        }
    }


}
