import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização Objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Esse numero é par!");
        } else {
            System.out.println("Esse numero é impar!");
        }

        if (num >= 0) {
            System.out.println("Esse número é positivo!");
        } else {
            System.out.println("Esse número é negativo!");
        }

        sc.close();

    }
}
