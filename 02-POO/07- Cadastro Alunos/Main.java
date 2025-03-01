public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Lucas", "ABC123");

        aluno.adicionaNota(10);
        aluno.adicionaNota(5);
        aluno.adicionaNota(8);

        System.out.println(aluno.calcularMedia());
        System.out.println(aluno.verificarAprovacao());


    }
}
