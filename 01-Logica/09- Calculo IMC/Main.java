import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização de Objeto
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.print("Digite sua peso em kg: ");
        double peso = sc.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("Seu IMC é %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está levemente acima do peso!");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você possui Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Você possui Obesidade grau II");
        } else {
            System.out.println("Você possui Obesidade grau III");
        }


    }
}