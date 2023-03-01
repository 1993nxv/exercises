package com.exercises1.entities;

import java.util.ArrayList;

public class Table extends Checkout{
    
    private int tableNumber;
    private ArrayList<Order> order;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        order = new ArrayList<>();
    }

    public int getTableNumber(){
        return this.tableNumber;
    }
    
    public void setTableOrder(int id, String client, String product, Double price ){
        int index = order.size();
        order.add(index++, new Order(id, client, product, price));
    }

    public ArrayList<Order> getOrder(){
        return order;
    }
    
}
