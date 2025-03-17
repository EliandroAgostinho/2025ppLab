public class Van extends Carro{
    public Van(String matricula, Condutor condutor) {
        super(matricula, condutor);
    }

    // Método específico da Van
    public void desligarAirbagPassageiro() {
        System.out.println("Airbag desligado!");
    }

    // Sobrescrevendo o método buzinar
    @Override
    public void buzinar() {
        System.out.println("Buzina do Van: Bip Bip");
    }
}
