package com.fabio.factorymethod.ex01;

public class Homem extends Pessoa{

    public Homem(String nome){
        this.nome = nome;
        System.out.println("Olá senhor "+nome);
    }

}
