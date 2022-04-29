package com.fabio.factorymethod.ex02;

public class Main {

    public static void main(String[] args) {

        Poligno factoryPoligno = FactoryPoligno.getPoligno(5);

        System.out.println("Eu tenho "+factoryPoligno.getNumberOfSides()+" lados");

    }
}
