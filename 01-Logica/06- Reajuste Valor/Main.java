import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inicialização de Objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double num = sc.nextDouble();

        System.out.println("O valor digitado acrescido 5% é de " + (num*1.05));

    }
}
