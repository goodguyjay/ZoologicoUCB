package modelos;

public final class Reptil extends Animal {
    private String nome;
    private int idade;
    private String especie;

    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "Disse: sss sss sss");
    }
}
