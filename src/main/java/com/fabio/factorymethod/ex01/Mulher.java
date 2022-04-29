package com.fabio.factorymethod.ex01;

public class Mulher extends Pessoa{

    public Mulher(String nome){
        this.nome = nome;
        System.out.println("Olá senhorita "+nome);
    }

}
