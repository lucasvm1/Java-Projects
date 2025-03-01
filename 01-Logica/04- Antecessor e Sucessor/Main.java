import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização de Objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.println((n-1)+ " " + n + " " +(n+1));

    }
}
