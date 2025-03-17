package org.example;

public class Carro {
    private String matricula;
    private int velocidadeAtual = 0;
    private final int velocidadeMaxima = 200;
    private boolean ligado;
    private Condutor condutor;

    /////////////////////////////////////////////////////////////////////////////////////////
    //Construtor
    public Carro(String mat, Condutor condt) {
        this.matricula = mat;
        this.ligado = false;
        this.condutor = condt;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //Getters e Seters


    public String getMatricula() {
        return matricula;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public boolean isLigado() {
        return ligado;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    //Ações do carro
    public void ligar() {
        ligado = true;
        System.out.println("Carro " + matricula + " ligado: VRUUUUMmmmmmmmmm");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro " + matricula + " desligado: MMMmmmmm");
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro " + matricula + " está desligado! Não pode acelerar.");
            return;
        }
        int aumento = 10 + (int)(condutor.getDestreza() * 0.10);
        velocidadeAtual += aumento;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
        System.out.println("Carro " + matricula + " acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void travar(int intensidadeTravagem) {
        if (!ligado) {
            System.out.println("O carro " + matricula + " está desligado! Não pode travar.");
            return;
        }
        velocidadeAtual -= intensidadeTravagem;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("Carro " + matricula + " travando. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void buzinar() {
        System.out.println("Piii Piii!");
    }

}
