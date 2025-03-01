import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<>();

    // Construtor

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }

    // Métodos
    public void adicionaNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        double media;
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return (media = soma / notas.size());

    }

    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 7;
    }



}
