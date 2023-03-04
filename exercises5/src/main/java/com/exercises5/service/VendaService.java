package com.exercises5.service;

import com.exercises5.domain.Produto;
import com.exercises5.domain.Venda;

public class VendaService {
    
    private Venda venda;

    public void novaVenda(String cliente, String vendedor){
        venda = new Venda(cliente, vendedor);
    }

    public void addProduto(String codigo, String name, String descricao, Double preco){
        venda.getProdutos().add(new Produto(codigo, name, descricao, preco));
    }

    public void calcularValorTotal(){
        Double valorTotal = 0D;
        for (Produto produto : venda.getProdutos()){
            valorTotal += produto.getPreco();
        }
        venda.setValorTotal(valorTotal);
    }

    public void imprimirNota(){
        System.out.println("-----VENDA REALIZADA-----");
        System.out.println("Vendedor: " + venda.getVendedor());
        System.out.println("Cliente: " + venda.getCliente());
        System.out.println(venda.getProdutos().toString().replaceAll("[\\[\\]]", "").replace(", ", ""));
        System.out.printf("Valor Total: R$%.2f", venda.getValorTotal());
    }

}
