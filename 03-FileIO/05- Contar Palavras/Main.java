import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Lucas\\Desktop\\Entrada.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {


            StringBuilder sb = new StringBuilder();

            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }

            String output = sb.toString().trim();

            String[] palavras = output.split("\\s+");

            if (palavras.length > 1) {
                System.out.println("Quantidade de palavras: " + palavras.length);
            } else {
                System.out.println("O arquivo está vazio!");
            }


        } catch (IOException | NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
