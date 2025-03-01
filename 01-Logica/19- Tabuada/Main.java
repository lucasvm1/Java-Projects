import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar Objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que deseja ver a tabuada: ");
        int n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}