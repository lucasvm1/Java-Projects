import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inicialização objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior idade");
        } else {
            System.out.println("Menor idade");
        }


    }
}