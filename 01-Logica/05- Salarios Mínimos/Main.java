import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização de Objeto
        Scanner sc = new Scanner(System.in);

        // Declaração de Variáveis
        double valosSalarioMinimo = 1518;
        double quantidadeSalariosMinimos;

        System.out.print("Digite seu salário atual: ");
        double valorSalario = sc.nextDouble();

        quantidadeSalariosMinimos = valorSalario / valosSalarioMinimo;

        System.out.printf("Você recebe %.2f salário(s) mínimo(s)", quantidadeSalariosMinimos);

    }
}
