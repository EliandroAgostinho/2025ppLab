
public class Citadino extends Carro{
    public Citadino(String matricula, Condutor condutor) {
        super(matricula, condutor);
    }

    // Método específico do Citadino
    public void ligarACManual() {
        System.out.println("AC ligado!");
    }

    // Sobrescrevendo o método buzinar
    @Override
    public void buzinar() {
        System.out.println("Buzina do Citadino: Piii Piii!");
    }

}
