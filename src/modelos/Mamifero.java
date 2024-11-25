package modelos;

public final class Mamifero extends Animal {
    private String nome;
    private int idade;
    private String especie;

    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "Disse: argh argh argh");
    }
}
