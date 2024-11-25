package modelos;

public final class Ave extends Animal {
    private String nome;
    private int idade;
    private String especie;

    public Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "Disse: piu piu piu");
    }
}
