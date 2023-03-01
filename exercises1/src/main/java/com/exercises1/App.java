package com.exercises1;

import com.exercises1.entities.Table;

/*
 *  1 – Um grupo contendo 3 amigos foram até uma lanchonete para comer lanche, cada um comeu um 
    combo, e no final decidiram dividir o valor total em igual valor para cada um. Imprima a descrição 
    e valor do combo e o nome da pessoal que o consumiu, e no final o valor total da conta a ser paga e 
    o valor unitário que cada um deve pagar, segue os dados do combo:
    a – Pedro, Combo Big, R$ 32,00
    b – Maria, Combo King, R$ 40,20
    c – João, Combo Moda da Cosa, R$ 50,50
*/

public class App {
    public static void main( String[] args ){

        Table table = new Table(1);

        table.setTableOrder(1, "Pedro", "Combo Big", 32.00);
        table.setTableOrder(2, "Maria", "Combo King", 40.20);
        table.setTableOrder(3, "João", "Combo Moda da Casa", 50.50);
        
        table.checkout(table.getOrder());
        table.splitAccount(table.getOrder().size());

        System.out.println(table);
        
    }
}
