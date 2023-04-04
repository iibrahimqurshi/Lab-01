package org.example;

public class Product {
    private int id;
    private double price;
    private String name;
    private int quantity;

    public Product(int id, double price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity(){
        return this.quantity;
    }

    public void getSellableStatus(){
        System.out.println("This product is sellable");
    }

    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
}
