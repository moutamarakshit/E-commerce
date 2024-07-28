package project;
public class Product {
    private int productId;
    private String name;
    private double price;
    private String description;

    public Product(int productId, String name, double price, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + " (ID: " + productId + ")");
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
        System.out.println("");
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
