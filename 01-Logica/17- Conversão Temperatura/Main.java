import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar objeto
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = sc.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        System.out.printf("A temperatura de %.2fFº é de %.2fCº ", temperaturaFahrenheit, temperaturaCelsius);

    }
}