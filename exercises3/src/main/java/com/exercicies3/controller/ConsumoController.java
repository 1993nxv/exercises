package com.exercicies3.controller;

import com.exercicies3.service.ConsumoService;

/*
4 amigos foram ao cinema assistir um filme, todos consumiram dos mesmos produtos, calcule o 
valor total que os amigos consumirão no local, segue os dados:
- Entrada R$ 18,00 - Pipoca Média R$ 15,00 e uma Coca cola 600ML R$ 9,00
*/

public class ConsumoController {
    public static void main( String[] args ){
        
        ConsumoService consumoService = new ConsumoService("Grupo de 4 amigos");

        consumoService.addProdutos("Entrada", 18.00, 4);
        consumoService.addProdutos("Pipoca Média", 15.00, 4);
        consumoService.addProdutos("Coca cola 600ML", 9.00, 4);

        consumoService.calculaValorTotalConsumo();

        consumoService.imprimirConsumo();

    }
}
