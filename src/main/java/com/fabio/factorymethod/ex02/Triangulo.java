package com.fabio.factorymethod.ex02;

public class Triangulo implements Poligno {

    public Triangulo(){
        System.out.println("Sou um Triangulo.");
    }

    @Override
    public Integer getNumberOfSides() {
        return 3;
    }
}
