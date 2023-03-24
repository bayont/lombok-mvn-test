package org.example;

class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1", "Product 1", 3, 10);
        // First test
        if(invoice.amount() == 30)
            System.out.println("Test 1 passed");
        else
            System.out.println("Test 1 failed");

        Invoice withInvalidQuantity = new Invoice("2", "Product 2", -1, 10);
        // Second test
        if(withInvalidQuantity.amount() == 0)
            System.out.println("Test 2 passed");
        else
            System.out.println("Test 2 failed");

        Invoice withInvalidPrice = new Invoice("3", "Product 3", 1, 0);
        // Third test
        if(withInvalidPrice.amount() == 0)
            System.out.println("Test 3 passed");
        else
            System.out.println("Test 3 failed");
    }
}