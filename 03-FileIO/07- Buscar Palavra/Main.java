import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String filePath = "C:\\Users\\Lucas\\Desktop\\Entrada.txt";
        String destinationPath = "C:\\Users\\Lucas\\Desktop\\Copia.txt";

        System.out.println("Digite a palavra que procura: ");
        String palavraProcurada = sc.nextLine();


        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {

            StringBuilder sb = new StringBuilder();
            String[] palavras;

            for (String line = bf.readLine(); line != null; line = bf.readLine()) {
                sb.append(line).append("\n");
            }

            String output = sb.toString().trim();

            palavras = output.split("\\s+");

            int contador = 0;

            for (String palavra : palavras) {
                if (palavra.equalsIgnoreCase(palavraProcurada)) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("Palavras encontradas: " + contador);
            } else {
                System.out.println("A palavra não foi encontrada");
            }

        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo");
        }


    }

}
