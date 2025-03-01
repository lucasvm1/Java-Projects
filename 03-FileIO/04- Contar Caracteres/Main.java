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
                sb.append(line + " ");
            }

            String output = sb.toString();

            output = output.replaceAll("\\s+", "");

            System.out.println(output.length());


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
