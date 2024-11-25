import modelos.Animal;

import java.util.ArrayList;

public final class Zoologico {
    private ArrayList<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
        System.out.println(animal.getNome() + " foi adicionado ao zoológico.");
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Não há animais no zoológico.");
        } else {
            for (Animal animal : animais) {
                System.out.println(animal);
            }
        }
    }

    public void emitirSomDeTodos() {
        if (animais.isEmpty()) {
            System.out.println("Não há animais no zoológico.");
        } else {
            for (Animal animal : animais) {
                animal.emitirSom();
            }
        }
    }
}
