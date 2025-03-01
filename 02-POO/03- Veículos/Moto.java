public class Moto extends Veiculo {

    private int cilindrada;

    // Construtor

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    // Getters & Setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    //Override
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(", Cilindradas: " + cilindrada + "\n");
        return sb.toString();
    }



}
