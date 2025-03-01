public class Main {
    public static void main(String[] args) {

        Personagem mago = new Mago("Lucas");
        Personagem guerreiro = new Guerreiro("Pedro");

        System.out.println(mago.getVida());
        System.out.println(guerreiro.getVida());

        guerreiro.atacar(mago);

        while (guerreiro.getVida() != 0) {
            mago.atacar(guerreiro);
        }



    }
}
