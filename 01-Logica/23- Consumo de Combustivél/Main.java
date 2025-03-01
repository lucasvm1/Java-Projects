import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciar Objeto
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tempo total da viagem em horas: ");
        int horasViagem = sc.nextInt();
        System.out.println("Digite a velocidade média da viagem em km/h: ");
        int velocidade = sc.nextInt();
        System.out.println("Digite a quantidade de km/l: ");
        int consumo = sc.nextInt();

        int distancia = horasViagem * velocidade;
        int litrosUsados = distancia / consumo;

        System.out.println("Você usou " + litrosUsados + " litros");


    }
}