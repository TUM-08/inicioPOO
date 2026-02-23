package com.sgp.model;

public pessoa {

    //Caracteristica / tipagem / apelido
    private String nome;
    private int idade;

    //Exemplo de Polimorfismo

    //Construtor do objeto
    Public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Construtor padrao do objeto
     Public Pessoa(){
        this.nome = "Testes";
        this.idade = 20;
    }

    //Metodos especificos
    public void saudaçao(){
        System.out.println("Ola," + nome + "voce tem " + idade + " anos")
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    // getters
    public StringgetNome(){
        return.nome = nome
    }
    public StringgetIdade(){
        return.idade = idade
    }

    //Setters
     public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override // Sobrescrta
    public String toString(){
        return"Pessoa [nome = "+ nome", idade "+ idade + "]"
    }

}