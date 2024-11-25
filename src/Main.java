import modelos.Animal;
import modelos.Ave;
import modelos.Mamifero;
import modelos.Reptil;

import java.util.Scanner;

public final class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Zoologico zoologico = new Zoologico();
    int opcao;

    do {
      System.out.println("\n--- Zoológico UCB ---");
      System.out.println("1. adicionar animal");
      System.out.println("2. listar animais");
      System.out.println("3. emitir som de todos os animais");
      System.out.println("4. sair");
      System.out.print("escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.print("digite o nome do animal: ");
          String nome = scanner.nextLine();
          System.out.print("digite a idade do animal: ");
          int idade = scanner.nextInt();
          scanner.nextLine();
          System.out.print("digite a espécie do animal (Mamífero, Ave, Réptil): ");
          String especie = scanner.nextLine().toLowerCase();

          Animal animal;
          if (especie.equals("mamífero") || especie.equals("mamifero")) {
            animal = new Mamifero(nome, idade, "Mamífero");
          } else if (especie.equals("ave")) {
            animal = new Ave(nome, idade, "Ave");
          } else if (especie.equals("réptil") || especie.equals("reptil")) {
            animal = new Reptil(nome, idade, "Réptil");
          } else {
            System.out.println("espécie inválida. tente novamente.");
            continue;
          }

          zoologico.adicionarAnimal(animal);
          break;

        case 2:
          zoologico.listarAnimais();
          break;

        case 3:
          zoologico.emitirSomDeTodos();
          break;

        case 4:
          System.out.println("adeus :)");
          break;

        default:
          System.out.println("que isso, essa opção é inválida. tente novamente.");
          break;
      }
    } while (opcao != 4);

    scanner.close();
  }
}
