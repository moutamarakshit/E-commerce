
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EcommerceSite {
    private List<Product> products;
    private List<Customer> customers;
    private List<Order> orders;

    public EcommerceSite() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        orders = new ArrayList<>();

        products.add(new Product(1, "Laptop", 1200, "Powerful laptop with high-performance specs."));
        products.add(new Product(2, "Phone", 800, "Smartphone with advanced features."));
        products.add(new Product(3, "Headphones", 150, "Noise-canceling headphones with great sound quality."));
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void listProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            product.displayProductInfo();
        }
    }

    public void processOrder(Customer customer) {
        Order order = customer.checkout();
        orders.add(order);
        order.displayOrderDetails();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Product> getProducts() {
        return products;
    }
}
