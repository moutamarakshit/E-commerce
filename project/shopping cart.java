package project;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Your shopping cart:");
            for (Product product : products) {
                product.displayProductInfo();
            }
        }
    }

    public void clearCart() {
        products.clear();
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
