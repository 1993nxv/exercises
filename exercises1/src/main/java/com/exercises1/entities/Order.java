package com.exercises1.entities;

public class Order {
    
    private int id;
    private String client;
    private String product;
    private Double price;

    public Order(int id, String client, String product, Double price) {
        this.id = id;
        this.client = client;
        this.product = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Client: " + client + " - Order: " + product + " Price: " + price;
    }

    
}
