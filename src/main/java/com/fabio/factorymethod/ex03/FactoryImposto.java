package com.fabio.factorymethod.ex03;

public class FactoryImposto {

    public static Imposto getImposto(String regiao){
        if (regiao.equals("Sul")) return new Sul();
        if (regiao.equals("Sudeste")) return new Sudeste();
        return new Nordeste();
    }
}
