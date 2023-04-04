package org.example;

import java.time.LocalDate;

public class App{

    public static void main(String[]args){
        Product p1 = new Product(6745, 5.50, "Penne Pasta");
        Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
        Product p3 = new Product(2106, 4.50, "Linguine Pasta");
        System.out.println("Total Quantity: " + p3.getTotalQuantity());
    }
}
