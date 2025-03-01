public class Carro extends Veiculo {

    private int quantidadePortas;

    // Construtor

    public Carro( String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    // Getters & Setters

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    //Override
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(", Quantidade de Portas: " + quantidadePortas + "\n");
        return sb.toString();
    }


}
