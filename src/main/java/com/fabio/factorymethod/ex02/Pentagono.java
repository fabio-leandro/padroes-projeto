package com.fabio.factorymethod.ex02;

public class Pentagono implements Poligno{

    public Pentagono(){
        System.out.println("Sou um Pentagono.");
    }

    @Override
    public Integer getNumberOfSides() {
        return 5;
    }
}
