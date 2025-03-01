import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis
        double a, b, c = 0;


        System.out.print("Digite valor de A: ");
        a = sc.nextDouble();
        System.out.print("Digite valor de B: ");
        b = sc.nextDouble();

        c = a;
        a = b;
        b = c;

        System.out.println("A = " + a
        + "\nB = " + b);


    }
}