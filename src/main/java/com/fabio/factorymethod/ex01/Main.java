package com.fabio.factorymethod.ex01;

public class Main {

    public static void main(String[] args) {

        FactoryPessoa factoryPessoa = new FactoryPessoa();
        String nome = "Carlos";
        String sexo = "M";
        factoryPessoa.getPessoa(nome,sexo);

    }
}
