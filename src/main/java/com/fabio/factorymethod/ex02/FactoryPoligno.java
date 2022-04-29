package com.fabio.factorymethod.ex02;

public class FactoryPoligno {

    public static Poligno getPoligno(Integer n){
        if (n == 3) return new Triangulo();
        if (n == 4) return  new Quadrado();
        if (n == 5) return  new Pentagono();
        return new Hexagono();
    }
}
