public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 12.00;
        double tax = 0.065; // 6.5%
        int quantity = 2;

        // Declare and assign a calculated totalPrice
        double subtotal = price * quantity;
        double totalPrice = subtotal + (subtotal * tax);

        // Modify message to include quantity 
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        System.out.println(message);

        // Print another message with the total cost
        System.out.printf("Total cost with tax is: $%.2f%n", totalPrice);
    }    
}