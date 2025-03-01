public class Funcionario {

    private String nome;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void calcularSalario() {
        if (this.cargo == Cargo.Gerente) {
            System.out.println("Salário + Bonus : R$ " + this.salario * 1.2);
        } else if (this.cargo == Cargo.Desenvolvedor) {
            System.out.println("Salário + Bonus : R$ " + this.salario * 1.1);
        } else {
            System.out.println("Salário + Bonus : R$ " + this.salario * 1.05);
        }
    }

}
