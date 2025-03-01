public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Gerente("Lucas", 1000);
        Funcionario funcionario2 = new Desenvolvedor("Felipe", 1000);


        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario2.getSalario());

    }
}
