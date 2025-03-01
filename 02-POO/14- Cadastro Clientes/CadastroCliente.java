import java.util.HashMap;

public class CadastroCliente {

    private HashMap<Integer, Cliente> clientes;

    public CadastroCliente() {
        clientes = new HashMap<>();
    }

    void cadastrarCliente(Cliente cliente) {
        clientes.put(cliente.getIdCliente(), cliente);
    }

    void removerCliente(int idCliente) {
        if (clientes.containsKey(idCliente)) {
            clientes.remove(idCliente);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    void buscarCliente(int idCliente) {
        Cliente cliente = clientes.get(idCliente);
        if (cliente != null) {
            System.out.println(cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }


    void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Clientes:");
            for (Cliente cliente : clientes.values()) {
                System.out.println("ID: " + cliente.getIdCliente() + " | Nome: " + cliente.getNome());
            }
        }
    }


}
