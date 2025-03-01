public class Papagaio extends Animal {

    private String frase;

    Papagaio(String nome, int idade, String frase) {
        super(nome, idade);
        this.frase = frase;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s um papagaio de %d anos falou: %s\n", this.getNome(), this.getIdade(), this.frase);
    }


}
