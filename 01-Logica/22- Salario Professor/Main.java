import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar objeto
        Scanner sc = new Scanner(System.in);

        // Variaveis
        double salarioLiquido;

        System.out.print("Digite valor da hora aula: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite a quantidade de aulas dadas: ");
        int quantidadeAulas = sc.nextInt();

        double salarioBruto = valorHora * quantidadeAulas;


        if (salarioBruto <= 1518) {
            salarioLiquido = salarioBruto;
        } else if (salarioBruto <= 2793.88) {
            salarioLiquido = (salarioBruto * 0.91) + 22.77;
        } else if (salarioBruto <= 4190.84) {
            salarioLiquido = (salarioBruto * 0.88) + 106.59;
        } else {
            salarioLiquido = (salarioBruto * 0.86) + 190.40;
        }

        System.out.printf("\nValor da hora: %.2f%n" +
                "Quantidade de Aulas: %d\n" +
                "Salario Bruto: R$%.2f\n" +
                "Salario Liquido: R$%.2f\n", valorHora, quantidadeAulas, salarioBruto, salarioLiquido);


    }
}