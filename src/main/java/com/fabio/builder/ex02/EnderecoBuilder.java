package com.fabio.builder.ex02;

public class EnderecoBuilder {

    private Endereco instancia;

    public EnderecoBuilder(){
        this.instancia = new Endereco();
    }

    public EnderecoBuilder setCep(String cep){
        instancia.setCep(cep);
        return this;
    }

    public EnderecoBuilder setRua(String rua){
        instancia.setRua(rua);
        return this;
    }

    public EnderecoBuilder setNumero(String numero){
        instancia.setNumero(numero);
        return this;
    }

    public EnderecoBuilder setComplemento(String complemento){
        instancia.setComplemento(complemento);
        return this;
    }

    public EnderecoBuilder setCidade(String cidade){
        instancia.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder setEstado(String estado){
        instancia.setEstado(estado);
        return this;
    }

    public EnderecoBuilder setPais(String pais){
        instancia.setPais(pais);
        return this;
    }

    public Endereco build(){
        return instancia;
    }


}
