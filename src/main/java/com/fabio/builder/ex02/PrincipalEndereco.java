package com.fabio.builder.ex02;

public class PrincipalEndereco {

    public static void main(String[] args) {

        Endereco endereco = new EnderecoBuilder()
                .setRua("Rua A")
                .setNumero("333")
                .setComplemento("444")
                .setCidade("BH")
                .setEstado("MG")
                .setPais("BR")
                .setCep("33333-000")
                .build();

        System.out.println(endereco);

    }
}
