import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Imprimivel> documentosImpressao = new ArrayList<>();

        documentosImpressao.add(new Relatorio("Estou fazendo exercícios Java!"));
        documentosImpressao.add(new Contrato("Lucas", "Pedro"));

        for (Imprimivel documento : documentosImpressao) {
            documento.imprimir();
        }

    }
}
