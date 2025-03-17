public class CarroReal extends CarroAbstrato implements Buzina {
    public CarroReal(String matricula, Condutor condutor) {
        super(matricula, condutor);
    }

    // Implementação do método buzinar
    @Override
    public void buzinar() {
        System.out.println("Buzina do CarroReal: Toooooooot!");
    }
}
