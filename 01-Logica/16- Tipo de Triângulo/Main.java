import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar objeto
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite lado A do triangulo: ");
        double ladoA = sc.nextDouble();
        System.out.println("Digite lado B do triangulo: ");
        double ladoB = sc.nextDouble();
        System.out.println("Digite lado C do triangulo: ");
        double ladoC = sc.nextDouble();

        if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {

            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Triângulo Equilatero");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Este triangulo não é possivel");
        }


    }
}