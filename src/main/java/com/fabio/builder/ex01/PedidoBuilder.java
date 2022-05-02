package com.fabio.builder.ex01;

import java.math.BigDecimal;

public class PedidoBuilder {

    private Pedido instancia;

    public PedidoBuilder(){
        this.instancia = new Pedido();
    }

    public PedidoBuilder setNumeroPedido(Integer numeroPedido){
        instancia.setNumero(numeroPedido);
        return this;
    }

    public PedidoBuilder setCliente(String nome,String rua,String numero,String cidade,String estado){
        instancia.setCliente(new Cliente(nome,rua,numero,cidade,estado));
        return this;
    }

    public PedidoBuilder setVendedor(String nome,String rua,String numero,String cidade,String estado){
        instancia.setVendedor(new Vendedor(nome,rua,numero,cidade,estado));
        return this;
    }

    public PedidoBuilder setProduto(String codigo, String nome, BigDecimal preco){
        instancia.getProdutos().add(new Produto(codigo,nome,preco));
        return this;
    }

    public Pedido build(){
        return instancia;
    }


}
