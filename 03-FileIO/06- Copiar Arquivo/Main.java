import java.io.*;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Lucas\\Desktop\\Entrada.txt";
        String destinationPath = "C:\\Users\\Lucas\\Desktop\\Copia.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            try (FileWriter writer = new FileWriter(destinationPath, true)) {

                for (String line = br.readLine(); line != null; line = br.readLine()) {
                    writer.write(line + "\n");
                }

                System.out.println("Arquivo copiado com sucesso!");

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo");
        }

    }

}
