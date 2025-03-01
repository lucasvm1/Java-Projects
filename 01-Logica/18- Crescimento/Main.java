public class Main {
    public static void main(String[] args) {

        // Variáveis
        int alturaFrancisco = 150;
        int alturaSara = 110;
        int meses = 0;

        do {
            meses++;
            alturaFrancisco += 1;
            alturaSara += 3;
        } while (alturaFrancisco > alturaSara);

        System.out.printf("Sara será maior que Franscisco em %d meses\n", meses);


    }
}