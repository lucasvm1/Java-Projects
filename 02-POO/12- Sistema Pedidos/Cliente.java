public class Cliente {

    private int idCliente;
    private String nome;

    public Cliente(int idCliente, String nome) {
        this.idCliente = idCliente;
        this.nome = nome;
    }

    // Get Set

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
