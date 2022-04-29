package com.fabio.singleton.ex03;

public class Main {

    public static void main(String[] args) {

        AcessoComum acessoComum = AcessoComum.getInstance();
        acessoComum.setBanco("Postgres");
        acessoComum.setUsuario("fabio");
        acessoComum.setSenha("fabio");

        AcessoComum paula = AcessoComum.getInstance();
        AcessoComum fabio = AcessoComum.getInstance();
        AcessoComum camila = AcessoComum.getInstance();

        System.out.println(paula.toString());
        System.out.println(fabio.toString());
        System.out.println(camila.toString());

    }
}
