public class Gerente extends Funcionario {

    double bonus;

    // Construtores

    Gerente(String nome, double salario) {
        super(nome, salario);
        this.bonus = 1.15;
    }

    //Getters & Setters
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Métodos

    public double getSalario() {
        return super.getSalario() * bonus;
    }



}
