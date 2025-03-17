//Eliandro Agostinho
package org.example;
import java.util.Random;

public class Corrida {
    public static void main(String[] args) {
        final int totalTurnos = 10;

        Condutor condutor1 = new Condutor("Alice", 30, 8);
        Condutor condutor2 = new Condutor("Bob", 28, 7);

        Carro carro1 = new Carro("ABC-1234", condutor1);
        Carro carro2 = new Carro("XYZ-5678", condutor2);

        carro1.ligar();
        carro2.ligar();

        Random random = new Random();

        for (int turno = 1; turno <= totalTurnos; turno++) {
            System.out.println("\n-- Turno " + turno + " --");

            carro1.acelerar();
            carro2.acelerar();

            if (random.nextInt(100) < 30) {
                int intensidadeTravagem = random.nextInt(16) + 5;
                System.out.println("Carro " + carro1.getMatricula() + " encontrou um obstáculo!");
                carro1.travar(intensidadeTravagem);
            }

            if (random.nextInt(100) < 30) {
                int intensidadeTravagem = random.nextInt(16) + 5;
                System.out.println("Carro " + carro2.getMatricula() + " encontrou um obstáculo!");
                carro2.travar(intensidadeTravagem);
            }

            System.out.println("Velocidade após o Turno " + turno + ":");
            System.out.println("Carro " + carro1.getMatricula() + " - " + carro1.getVelocidadeAtual() + " km/h");
            System.out.println("Carro " + carro2.getMatricula() + " - " + carro2.getVelocidadeAtual() + " km/h");
        }

        carro1.desligar();
        carro2.desligar();

        System.out.println("\nVelocidade final do Carro 1 (" + carro1.getCondutor().getNome() + "): " + carro1.getVelocidadeAtual() + " km/h");
        System.out.println("Velocidade final do Carro 2 (" + carro2.getCondutor().getNome() + "): " + carro2.getVelocidadeAtual() + " km/h");

        if (carro1.getVelocidadeAtual() > carro2.getVelocidadeAtual()) {
            System.out.println("\nVencedor: Carro 1 (" + carro1.getCondutor().getNome() + ")");
        } else if (carro1.getVelocidadeAtual() < carro2.getVelocidadeAtual()) {
            System.out.println("\nVencedor: Carro 2 (" + carro2.getCondutor().getNome() + ")");
        } else {
            System.out.println("\nEmpate na corrida!");
        }
    }
}
