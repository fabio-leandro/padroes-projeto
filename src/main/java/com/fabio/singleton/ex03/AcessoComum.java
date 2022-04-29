package com.fabio.singleton.ex03;

public class AcessoComum {

    private static AcessoComum acessoComum;

    private String banco;
    private String usuario;
    private String senha;

    private AcessoComum(){}

    public static AcessoComum getInstance(){
        if (acessoComum == null){
            acessoComum = new AcessoComum();
        }
        return acessoComum;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "banco='" + banco + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
