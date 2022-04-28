package com.fabio.singleton.ex01;

public class Main {

    public static void main(String[] args) {

        Impressao impressao1 = Impressao.getInstance();
        Impressao impressao2 = Impressao.getInstance();
        Impressao impressao3 = Impressao.getInstance();
        Impressao impressao4 = Impressao.getInstance();

        System.out.println(impressao1);
        System.out.println(impressao2);
        System.out.println(impressao3);
        System.out.println(impressao4);

    }
}
