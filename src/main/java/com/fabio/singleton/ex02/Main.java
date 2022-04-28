package com.fabio.singleton.ex02;

public class Main {

    public static void main(String[] args) {
        Reitor reitor1, reitor2, reitor3;
        //reitor1 = new Reitor(); Não permite instanciar, contrutor privado

        reitor2 = Reitor.obterInstancia();
        reitor2.setarNome("João");
        reitor3 = Reitor.obterInstancia();

        if(reitor2 == reitor3){
            System.out.println("Mesmo reitor");
            System.out.println("Nome do reitor 2 = " + reitor2.obterNome());
            System.out.println("Nome do reitor 3 = " + reitor3.obterNome());
        }
    }
}
