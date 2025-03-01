import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicializar objeto
        Scanner sc = new Scanner(System.in);

        // Variáveis
        int anoAtual = 2025;

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;

        System.out.printf("Você viveu aproximadamente %d anos, %d meses, %d dias", idadeAnos, idadeMeses, idadeDias);

    }
}