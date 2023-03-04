package com.exercises5.controller;

import com.exercises5.service.VendaService;

/**
Crie uma lista de cadastro de produtos, onde você precisará informar um código, descrição e 
valor unitário, em seguida cria um simples venda onde conterá o nome do cliente, nome de quem 
fez a venda, a lista de produtos vendidos e o valor total da venda.
 */

public class Controller {
    public static void main( String[] args ){
        
        VendaService venda = new VendaService();

        venda.novaVenda("Maria", "Pedro");
        venda.addProduto("#C101", "Camiseta", "Tamanho M", 59.90);
        venda.addProduto("#C102", "Bone", "Tamanho P", 32.90);
        venda.addProduto("#C103", "Calça", "Tamanho 40", 120.00);

        venda.calcularValorTotal();
        venda.imprimirNota();

    }

}
