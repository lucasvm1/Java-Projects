public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Lucas", 1000, Cargo.Gerente);
        Funcionario funcionario2 = new Funcionario("Pedro", 1000, Cargo.Desenvolvedor);
        Funcionario funcionario3 = new Funcionario("José", 1000, Cargo.Analista);

        funcionario.calcularSalario();
        funcionario2.calcularSalario();
        funcionario3.calcularSalario();


    }
}
