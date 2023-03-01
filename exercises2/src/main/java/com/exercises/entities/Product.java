package main.java.com.exercises.entities;

/**
2 – João é um vendedor de uma fábrica de brinquedos, ao sair para vender, joão levou uma certa 
quantidade de produtos como estoque, e vendeu parte dela, calcule a quantidade que sobrou de 
estoque e o valor total que joão arrecadou com as vendas, segue os dados dos produtos:
a – Boneca, Valor unitário R$ 6,00, Qtd Estoque = 100, Qtd Vendida = 15
b – Carrinho de madeira, Valor unitário R$ 26,00, Qtd Estoque = 30, Qtd Vendida = 20
 */

public class Product {
    
    private int id;
    private String name;
    private double price;
    private int stock;
    private int quantitySold;

    

    private Product(int id, String name, double price, int stock, int quantitySold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.quantitySold = quantitySold;
    }

    public static class ProductBuilder{

        private int id;
        private String name;
        private double price;
        private int stock;
        private int quantitySold;
        
        
        public ProductBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public ProductBuilder quantitySold(int quantitySold) {
            this.quantitySold = quantitySold;
            return this;
        }

        public Product build(){
            return new Product(id, name, price, stock, quantitySold);
        }
    }

    public void refreshStock(){
        this.stock -= this.quantitySold;
    }

    public int getStock(){
        return this.stock;
    }

    public double totalSales(){
        return this.quantitySold * price;
    }

    @Override
    public String toString(){
        return 
            "Product: " + this.name 
            + "\nPrice: R$" + this.price
            + "\nStock: " + this.stock
            + "\nQuantity Sold:" + this.quantitySold
            + "\nTotal Sales: R$" + this.totalSales();
    }

}
