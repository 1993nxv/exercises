package com.exercises1.entities;

import java.util.ArrayList;

public class Checkout {

    private double total = 0;
    private double split = 0;
    private ArrayList<Order> orderCheckout = new ArrayList<>();
    private StringBuffer orderDescription = new StringBuffer();
    

    public double splitAccount(int numClients){
        split = total / numClients;
        return split;
    }

    public double checkout(ArrayList<Order> order){
        orderCheckout = order;
        for(Order o : order){
            orderDescription.append(o.toString() + "\n");
            total += o.getPrice();
        }
        return total;
    }

    @Override
    public String toString(){
        return 
        "----------CHECKOUT----------\n" 
        + orderDescription.toString()
        + "Total: R$" + total
        + (split != 0 ?"\nSplit for " + orderCheckout.size() + " : R$" + split:"");
    }
    
}
