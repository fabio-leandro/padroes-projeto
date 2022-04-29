package com.fabio.factorymethod.ex02;

public class Quadrado implements Poligno{

    public Quadrado(){
        System.out.println("Sou um quadrado.");
    }

    @Override
    public Integer getNumberOfSides() {
        return 4;
    }
}
