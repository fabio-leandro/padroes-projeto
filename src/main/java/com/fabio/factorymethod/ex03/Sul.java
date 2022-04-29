package com.fabio.factorymethod.ex03;

public class Sul implements Imposto{
    @Override
    public Double getImposto(Double valor) {
        return valor * 0.18;
    }
}
