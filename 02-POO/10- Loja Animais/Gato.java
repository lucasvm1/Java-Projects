public class Gato extends Animal {

    Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s um gato de %d anos miou!\n", this.getNome(), this.getIdade());
    }


}
