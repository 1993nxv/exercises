package com.exercicies3.domain;

import java.util.ArrayList;
import java.util.List;

public class Consumo {

    private String nomeCliente;
    private List<Produto> produtosConsumidos;
    private double valorTotalConsumo;
    
    public Consumo(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.produtosConsumidos = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Produto> getProdutosConsumidos() {
        return produtosConsumidos;
    }

    public void addProdutosConsumidos(Produto produto) {
        this.produtosConsumidos.add(produto);
    }

    public double getValorTotalConsumo() {
        return valorTotalConsumo;
    }

    public void setValorTotalConsumo(double valorTotalConsumo) {
        this.valorTotalConsumo = valorTotalConsumo;
    }

    
    

}
