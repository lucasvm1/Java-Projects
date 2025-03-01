public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto("Honda", "PCX 160", 2019, 120);
        Carro carro = new Carro("Toyota", "Etios", 2015, 4);

        System.out.println(moto.toString());
        System.out.println(carro.toString());
    }
}
