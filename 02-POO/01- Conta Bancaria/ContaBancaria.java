public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    // Construtor

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }


    // Getters & Setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    // Métodos

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    // Overrides

    @Override
    public String toString() {
        return ("Conta: " + this.numeroConta + ", Titular: " + this.titular + ", Saldo: " + this.saldo);
    }

}
