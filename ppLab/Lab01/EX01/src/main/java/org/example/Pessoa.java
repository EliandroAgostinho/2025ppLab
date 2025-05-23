package org.example;

public class Pessoa {
 /////////////////////////////////////////////////////////////////////////////////////
    private String nome;
    private char genero;
    private int idade;

    public Pessoa() { // Construtor vazio

    }

    public Pessoa(String n, char g) {
        this.nome = n;
        this.genero = g;
    }

    public Pessoa(String n, char g, int i) {
        this.nome = n;
        this.genero = g;
        this.idade = i;
    }


    //////////////////////////////////////////////////////////////////////////////////////
    //Metodo falar
    public void falar(){
            System.out.println("Olá, meu nome é " + this.nome);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    //Setters e Getters
    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public char getGenero() {
            return genero;
    }

    public void setGenero(char genero) {
            this.genero = genero;
    }

    public int getIdade() {
            return idade;
    }

    public void setIdade(int idade) {
            this.idade = idade;
    }
////////////////////////////////////////////////////////////////////////////////////////////
}
