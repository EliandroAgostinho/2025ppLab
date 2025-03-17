//Eliandro Agostinho
public class TestEx02 {
    public static void main(String[] args) {
        // Criando um condutor
        Condutor condutor = new Condutor("Bob", 35, 7);

        // Criando um CarroReal
        CarroReal carroReal = new CarroReal("DDD-4444", condutor);

        // Interagindo com o CarroReal
        carroReal.ligar();
        carroReal.acelerar();
        carroReal.buzinar();
        carroReal.travar(15);
        carroReal.desligar();
    }
}
