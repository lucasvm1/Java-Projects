import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização de Objetos
        Scanner sc = new Scanner(System.in);

        //Declaração Variáveis
        double resultado;

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        if (a == b) {
            resultado = a + b;
        } else {
            resultado = a * b;
        }

        System.out.println("Resultado: " + resultado);

    }
}
