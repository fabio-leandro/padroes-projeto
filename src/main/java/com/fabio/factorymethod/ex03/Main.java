package com.fabio.factorymethod.ex03;

public class Main {

    public static void main(String[] args) {

        Imposto imposto = FactoryImposto.getImposto("Sudeste");
        System.out.println(imposto.getImposto(100d));
    }
}
