

/*You are building a shopping cart application in Java. The application needs to calculate the total cost of all the
items in the cart. Each item has a price and a quantity. How would you use Java aggregations to
 calculate the total cost?*/


package Aggrigation_Part_two_Task6;

public class CartItem {
    private double price;
    private int quantity;

    public CartItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
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


