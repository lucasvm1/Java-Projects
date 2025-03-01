import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto que deseja salvar:");
        String texto = sc.nextLine();

        sc.close();

        try(FileWriter writer = new FileWriter("texto.txt")) {
            writer.write(texto);
            System.out.println("Salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }


    }
}