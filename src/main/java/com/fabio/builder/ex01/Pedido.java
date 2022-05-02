package com.fabio.builder.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private Integer numero;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(Integer numero, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Pedido() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(numero, pedido.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", cliente=" + cliente + "\n"+
                ", vendedor=" + vendedor + "\n"+
                ", produtos=" + produtos +
                '}';
    }
}
