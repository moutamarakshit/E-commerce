package project;
public class Order {
    private static int orderCounter = 0;
    private int orderId;
    private List<Product> products;
    private double totalAmount;

    public Order(ShoppingCart cart) {
        orderCounter++;
        this.orderId = orderCounter;
        this.products = new ArrayList<>(cart.getProducts());
        this.totalAmount = cart.calculateTotal();
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products Purchased:");
        for (Product product : products) {
            System.out.println("- " + product.getName());
        }
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("");
    }

    public int getOrderId() {
        return orderId;
    }
}
