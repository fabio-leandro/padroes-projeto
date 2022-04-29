package com.fabio.factorymethod.ex01;

public class FactoryPessoa {

    public Pessoa getPessoa(String nome, String sexo){
        if (sexo.equals("M")){
            return new Homem(nome);
        }
        return new Mulher(nome);
    }
}
