import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialização de Objeto
        Scanner sc = new Scanner(System.in);

        //Declaração Variáveis
        double valor = 100;
        double valorTotal = 0;
        int opcao = 0;

        System.out.println("Selecione a forma de pagamento: " +
                "\n1- Dinheiro ou Pix (15% de desconto)"
                + "\n2- À vista cartão de Crédito (10% de desconto)"
                + "\n3- Parcelado 2x"
                + "\n4- Parcelado 3x ou mais (Acrescimo de 10%)");


        while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    valorTotal = valor * 0.85;
                }
                case 2 -> {
                    valorTotal = valor * 0.90;
                }
                case 3 -> {
                    valorTotal = valor;
                }
                case 4 -> {
                    valorTotal = valor * 1.1;
                }
                default -> {
                    System.out.println("Forma de pagamento inválida");
                }
            }
        }

        System.out.printf("Total da compra: R$%.2f", valorTotal);

    }
}