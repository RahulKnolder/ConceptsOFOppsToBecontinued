package Aggrigation_1;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<CartItem>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (CartItem item : items) {
            totalCost += item.getPrice() * item.getQuantity();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        // create some cart items
        CartItem item1 = new CartItem(10.0, 2);
        CartItem item2 = new CartItem(5.0, 3);
        CartItem item3 = new CartItem(2.5, 1);

        // create a shopping cart and add the items to it
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // calculate the total cost of all items in the cart
        double totalCost = cart.getTotalCost();

        // print the total cost to the console
        System.out.println("Total cost of items in the cart: $" + totalCost);
    }

}
