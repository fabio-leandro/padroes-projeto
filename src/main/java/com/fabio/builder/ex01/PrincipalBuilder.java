package com.fabio.builder.ex01;

import java.math.BigDecimal;

public class PrincipalBuilder {

    public static void main(String[] args) {

        Pedido pedido = new PedidoBuilder()
                .setNumeroPedido(1)
                .setCliente("fabio","Rua A","333","Belo Horizonte", "Minas Gerais")
                .setVendedor("Patricia","Rua B","444","Contagem", "Minas Gerais")
                .setProduto("P01","Bola", new BigDecimal("35.00"))
                .setProduto("P02","Meiao", new BigDecimal("15.00"))
                .setProduto("P03","Colete",new BigDecimal("20.00"))
                .build();
        System.out.println("Pedido Builder");
        System.out.println(pedido);

    }
}
