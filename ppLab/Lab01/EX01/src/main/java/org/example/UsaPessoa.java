//Eliandro Agostinho
package org.example;
import java.util.Scanner;

public class UsaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos Pessoa com diferentes construtores
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("João", 'M');
        Pessoa pessoa3 = new Pessoa("Maria", 'F', 25);

        // Permitindo que o usuário insira valores para uma nova Pessoa
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o gênero (M/F): ");
        char genero = scanner.next().charAt(0);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa4 = new Pessoa(nome, genero, idade);

        // Exibindo detalhes das pessoas
        System.out.println("Pessoa 1: " + pessoa1.getNome());
        System.out.println("Pessoa 2: " + pessoa2.getNome());
        System.out.println("Pessoa 3: " + pessoa3.getNome());
        System.out.println("Pessoa 4: " + pessoa4.getNome());

        // Chamando o método falar()
        pessoa4.falar();
    }
}
