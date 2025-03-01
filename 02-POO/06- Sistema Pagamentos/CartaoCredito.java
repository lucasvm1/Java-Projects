public class CartaoCredito implements Pagamento {

    private double taxa;

    public CartaoCredito(double taxa) {
        this.taxa = taxa;
    }

    //Getters & Setters

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    // Métodos

    @Override
    public double pagar(double valor) {
        return Math.round(valor * (this.taxa / 100 + 1));
    }

}
