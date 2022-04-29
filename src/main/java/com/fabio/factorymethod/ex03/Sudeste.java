package com.fabio.factorymethod.ex03;

public class Sudeste implements Imposto{
    @Override
    public Double getImposto(Double valor) {
        return valor * 0.20;
    }
}
