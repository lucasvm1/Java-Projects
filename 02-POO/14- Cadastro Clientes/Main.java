public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Lucas");
        Cliente cliente2 = new Cliente(2, "Pedro");
        Cliente cliente3 = new Cliente(3, "Gabriel");

        CadastroCliente cadastroCliente = new CadastroCliente();

        cadastroCliente.cadastrarCliente(cliente);
        cadastroCliente.cadastrarCliente(cliente2);
        cadastroCliente.cadastrarCliente(cliente3);

        cadastroCliente.listarClientes();

        cadastroCliente.buscarCliente(1);

        cadastroCliente.removerCliente(1);

        cadastroCliente.listarClientes();


    }
}
