package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

//        1. Create variables for an item name (String) and item price (double)
        String soda = "Fanta";
        double price = 2.51;

//        2. Create a quantity variable (int)
        int quantity = 7;

//        3. Build and print: EX. "You bought 3 apples for $7.10"
        System.out.println("You bought " + quantity + " " + soda + " for " + price);
    }
}
