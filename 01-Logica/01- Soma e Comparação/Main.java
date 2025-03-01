import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarar variáveis
        double a, b, c, soma;

        // Inicialização de Objetos
        Scanner sc = new Scanner(System.in);

        // Entrada do Usuário
        System.out.print("Digite valor de A: ");
        a = sc.nextDouble();

        System.out.print("Digite valor de B: ");
        b = sc.nextDouble();

        System.out.print("Digite valor de C: ");
        c = sc.nextDouble();

        sc.close();

        soma = (a + b);

        System.out.println(soma);

        if (soma > c) {
            System.out.println("A soma de A e B é maior que C");
        } else if (soma < c) {
            System.out.println("A soma de A e B é menor que C");
        } else {
            System.out.println("A soma de A e B é igual a C");
        }


    }
}
