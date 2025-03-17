public abstract class CarroAbstrato extends Carro {
    public CarroAbstrato(String matricula, Condutor condutor) {
        super(matricula, condutor);
    }

    // Método abstrato buzinar
    public abstract void buzinar();
}
