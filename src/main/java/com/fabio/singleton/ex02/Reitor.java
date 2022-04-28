package com.fabio.singleton.ex02;

public class Reitor {

    private String nome;

    private Reitor(){}
    private static Reitor reitor = new Reitor();

    public static synchronized Reitor obterInstancia(){
        return reitor;
    }

    public String obterNome(){
        return reitor.nome;
    }

    public void setarNome(String nome){
        this.nome = nome;
    }
}