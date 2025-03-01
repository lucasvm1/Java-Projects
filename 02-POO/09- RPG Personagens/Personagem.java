public abstract class Personagem {

    private String nome;
    private int vida;
    private int ataque;

    Personagem(String nome) {
        this.nome = nome;
    }

    // Getters & Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    // Métodos
    public void atacar(Personagem personagem) {

        if (personagem.vida <= 0) {
            System.out.printf("Personagem %s morreu!\n", personagem.getNome());
        } else {
            personagem.vida -= this.ataque;
            System.out.printf("O personagem %s foi atacado com sucesso!\nVida atual do alvo: %d\n", personagem.getNome(), personagem.getVida());
        }


    }


}
