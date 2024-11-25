package modelos;

public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nEspécie: " + this.especie;
    }

    public abstract void emitirSom();
}
