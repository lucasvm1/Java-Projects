public class Cachorro extends Animal {

    Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s um cachorro de %d anos latiu!\n", this.getNome(), this.getIdade());
    }

}
