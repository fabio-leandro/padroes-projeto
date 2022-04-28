package com.fabio.singleton.ex01;

public class Impressao {

    private static Impressao impressao;

    private Impressao(){}

    public static Impressao getInstance(){
        if (impressao == null){
            impressao = new Impressao();
        }
        return impressao;
    }


}
