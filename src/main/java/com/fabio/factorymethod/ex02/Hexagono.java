package com.fabio.factorymethod.ex02;

public class Hexagono implements Poligno{


    public Hexagono(){
        System.out.println("Sou um Hexagono.");
    }

    @Override
    public Integer getNumberOfSides() {
        return 6;
    }
}
