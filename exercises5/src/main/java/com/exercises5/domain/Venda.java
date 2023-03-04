package com.exercises5.domain;

import java.util.ArrayList;

public class Venda {
    
    private String cliente;
    private String vendedor;
    private ArrayList<Produto> produtos;
    private Double valorTotal;
    
    public Venda(String cliente, String vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setValorTotal(Double valorTotal){
        this.valorTotal = valorTotal;
    }

    public Double getValorTotal(){
        return valorTotal;
    }

}
