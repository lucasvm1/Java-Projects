public class Contrato implements Imprimivel {

    private String signatario1;
    private String signatario2;

    // Construtor
    public Contrato(String signatario1, String signatario2) {
        this.signatario1 = signatario1;
        this.signatario2 = signatario2;
    }

    // Override
    @Override
    public void imprimir() {
        System.out.printf("Contrato entre: %s e %s\n", signatario1, signatario2);
    }
}