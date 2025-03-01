import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Lucas\\Desktop\\Entrada.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }


    }
}
