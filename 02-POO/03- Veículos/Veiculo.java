public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;

    // Construtor

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters & Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos

    @Override
    public String toString() {
        return ("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

}
