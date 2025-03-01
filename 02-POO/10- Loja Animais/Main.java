public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex", 10);
        Animal gato = new Gato("Mimi", 5);
        Animal papagaio = new Papagaio("Lulu", 15, "Eu só repito frases!");

        cachorro.emitirSom();
        gato.emitirSom();
        papagaio.emitirSom();

    }
}
