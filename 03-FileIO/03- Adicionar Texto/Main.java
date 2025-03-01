import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resposta;

        String filePath = "C:\\Users\\Lucas\\Desktop\\Saida.txt";


        do {

            System.out.println("Digite para salvar o texto!");
            String texto = sc.nextLine();

            try (FileWriter writer = new FileWriter(filePath, true)) {

                writer.write(texto + "\n");

                System.out.println("Linha adicionada com sucesso!");

            } catch (IOException e) {
                System.out.println("Erro ao carregar arquivo: + " + e.getMessage());
            }

            do {
                System.out.print("Deseja adicionar outra linha? (s/n): ");
                resposta = sc.nextLine().toLowerCase();
            } while (!resposta.equals("s") && !resposta.equals("n"));

        } while (resposta.equals("s"));

        sc.close();


    }

}

