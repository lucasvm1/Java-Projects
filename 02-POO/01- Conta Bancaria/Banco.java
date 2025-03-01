import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    // Construtor

    public Banco(String nome) {
        this.nome = nome;
    }

    // Getters & Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

    // Métodos

    public void adicionarConta(ContaBancaria conta) {
        this.contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        this.contas.remove(conta);
    }

    public void buscarConta(int numeroConta) {

        boolean contaEncontrada = false;

        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                System.out.println(conta.toString());
                contaEncontrada = true;
            }

        }

        if (!contaEncontrada) {
            System.out.println("Conta inexistente");
        }

    }


}
