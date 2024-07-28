package project;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private ShoppingCart shoppingCart;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.shoppingCart = new ShoppingCart();
    }

    public void addToCart(Product product) {
        shoppingCart.addProduct(product);
    }

    public void viewCart() {
        shoppingCart.displayCart();
    }

    public Order checkout() {
        Order order = new Order(shoppingCart);
        shoppingCart.clearCart();
        return order;
    }

    public int getCustomerId() {
        return customerId;
    }
}
