package org.example;

public class Condutor {
    private String nome;
    private int idade;
    private int destreza;

    ///////////////////////////////////////////////////////////////////////////////////////
    //Construtor
    public Condutor(String nome, int idade, int destreza) {
        this.nome = nome;
        this.idade = idade;
        this.destreza = destreza;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
