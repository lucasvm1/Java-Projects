public class Main {
    public static void main(String[] args) {

        Pagamento cartaoCredito = new CartaoCredito(10);
        Pagamento pix = new Pix(1);
        Pagamento boleto = new Boleto(2);

        System.out.println(cartaoCredito.pagar(100));
        System.out.println(pix.pagar(100));
        System.out.println(boleto.pagar(100));

    }
}
