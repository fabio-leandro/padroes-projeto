package com.fabio.builder.ex01;

import java.math.BigDecimal;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Fabio");
        cliente.setRua("Rua A");
        cliente.setNumero("333");
        cliente.setCidade("Belo Horizonte");
        cliente.setEstado("Minas Gerais");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Patricia");
        vendedor.setRua("Rua B");
        vendedor.setNumero("555");
        vendedor.setCidade("Contagem");
        vendedor.setEstado("Minas Gerais");

        Produto p1 = new  Produto();
        p1.setCodigo("P01");
        p1.setNome("Bola");
        p1.setPreco(new BigDecimal("35.00"));

        Produto p2 = new  Produto();
        p2.setCodigo("P02");
        p2.setNome("Meiao");
        p2.setPreco(new BigDecimal("15.00"));

        Produto p3 = new  Produto();
        p3.setCodigo("P03");
        p3.setNome("Colete");
        p3.setPreco(new BigDecimal("35.00"));

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setNumero(1);
        pedido.setVendedor(vendedor);
        pedido.getProdutos().addAll(List.of(p1,p2,p3));

        System.out.println(pedido.toString());


    }
}
