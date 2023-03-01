package com.exercises;

import main.java.com.exercises.entities.Product;

/**
2 – João é um vendedor de uma fábrica de brinquedos, ao sair para vender, joão levou uma certa 
quantidade de produtos como estoque, e vendeu parte dela, calcule a quantidade que sobrou de 
estoque e o valor total que joão arrecadou com as vendas, segue os dados dos produtos:
a – Boneca, Valor unitário R$ 6,00, Qtd Estoque = 100, Qtd Vendida = 15
b – Carrinho de madeira, Valor unitário R$ 26,00, Qtd Estoque = 30, Qtd Vendida = 20
 */
public class App {
    public static void main( String[] args ){

        Product productOne  = new Product.ProductBuilder()
            .id(1)
            .name("Boneca")
            .price(6.0)
            .stock(100)
            .quantitySold(15)
            .build();

        Product productTwo  = new Product.ProductBuilder()
            .id(2)
            .name("Carrinho de madeira")
            .price(26.0)
            .stock(30)
            .quantitySold(20)
            .build();

        System.out.println("\n---SALES REPORT - João---\n");
        productOne.refreshStock();
        System.out.println(productOne + "\n");
        productTwo.refreshStock();
        System.out.println(productTwo);
  
    }
}
