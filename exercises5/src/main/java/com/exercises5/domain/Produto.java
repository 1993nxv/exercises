package com.exercises5.domain;

public class Produto {
    
    private String codigo;
    private String name;
    private String descricao;
    private Double preco;

    public Produto(String codigo, String name, String descricao, Double preco) {
        this.codigo = codigo;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto Codigo:" + codigo + " - Nome:" + name + " - Descricao:" + descricao + " - Preço:" + preco + "\n";
    }

}
