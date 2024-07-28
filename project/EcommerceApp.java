package project;
import java.util.Scanner;

public class EcommerceApp {
    public static void main(String[] args) {
        EcommerceSite ecommerceSite = new EcommerceSite();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the E-commerce Site!");
            System.out.println("1. List Products");
            System.out.println("2. Add product to cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ecommerceSite.listProducts();
                    break;
                case 2:
                    System.out.print("Enter the ID of the product you want to add to the cart: ");
                    int productId = scanner.nextInt();
                    Product product = ecommerceSite.getProducts().stream()
                            .filter(p -> p.getProductId() == productId)
                            .findFirst()
                            .orElse(null);
                    if (product != null) {
                        System.out.print("Enter your customer ID: ");
                        int customerId = scanner.nextInt();
                        Customer customer = ecommerceSite.getCustomers().stream()
                                .filter(c -> c.getCustomerId() == customerId)
                                .findFirst()
                                .orElse(null);
                        if (customer != null) {
                            customer.addToCart(product);
                            System.out.println(product.getName() + " added to your cart.");
                        } else {
                            System.out.println("Customer not found. Please add yourself as a customer first.");
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter your customer ID to view your cart: ");
                    customerId = scanner.nextInt();
                    customer = ecommerceSite.getCustomers().stream()
                            .filter(c -> c.getCustomerId() == customerId)
                            .findFirst()
                            .orElse(null
    
}
