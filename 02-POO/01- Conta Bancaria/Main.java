public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1234, "Lucas", 100.0);
        ContaBancaria conta2 = new ContaBancaria(5678, "Bob", 100.0);
        ContaBancaria conta3 = new ContaBancaria(9876, "Jane", 100.0);

        conta1.depositar(100.0);

        conta2.sacar(101.0);

        conta1.exibirSaldo();

        Banco bancoJava = new Banco("Banco Java");

        bancoJava.adicionarConta(conta1);
        bancoJava.adicionarConta(conta2);
        bancoJava.adicionarConta(conta3);

        bancoJava.buscarConta(9876);

        bancoJava.buscarConta(0000);




    }
}