import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização de Objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite nota da primeira prova: ");
        double nota = sc.nextDouble();
        System.out.print("Digite nota da segunda prova: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite nota da terceira prova: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite nota da quarta prova: ");
        double nota4 = sc.nextDouble();

        double media = (nota + nota2 + nota3 + nota4) / 4;

        System.out.printf("\nA média das provas é %.2f", media);
        if (media >= 7) {
            System.out.println("O aluno aprovado com sucesso!");
        } else {
            System.out.println("nO aluno foi reprovado...");
        }

    }
}