//Eliandro Agostinho
import java.util.ArrayList;
import java.util.List;

public class TestEx01 {
    public static void main(String[] args) {
        // Criando condutores
        Condutor condutor1 = new Condutor("Alice", 30, 8);
        Condutor condutor2 = new Condutor("Bob", 28, 7);

        // Criando carros
        Citadino citadino = new Citadino("AAA-1111", condutor1);
        Van van = new Van("BBB-2222", condutor2);

        // Adicionando carros a uma lista
        List<Carro> carros = new ArrayList<>();
        carros.add(citadino);
        carros.add(van);

        // Interagindo com os carros
        for (Carro carro : carros) {
            carro.ligar();
            carro.acelerar();
            carro.buzinar();
            carro.desligar();

            // Verificando o tipo do carro e chamando métodos específicos
            if (carro instanceof Citadino) {
                ((Citadino) carro).ligarACManual();
            } else if (carro instanceof Van) {
                ((Van) carro).desligarAirbagPassageiro();
            }

            System.out.println("---------------------------------------");
        }
    }
}
