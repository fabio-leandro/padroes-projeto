package com.fabio.factorymethod.ex03;

public class Nordeste implements Imposto{
    @Override
    public Double getImposto(Double valor) {
        return valor * 0.07;
    }
}
