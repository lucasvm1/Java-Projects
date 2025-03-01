import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inicialização Objetos
        Scanner sc = new Scanner(System.in);

        //Declaração de Variávies
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        int[] numbers = {n1, n2, n3};

        Arrays.sort(numbers);

        for (Number n : numbers) {
            System.out.print(n + " ");
        }


    }
}
