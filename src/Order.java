import java.util.List;

public class Order {

    // Parameters
    private int orderID;
    private List<String> products;
    private int totalPrice;
    private String status;

    // Constructor
    public Order(OrderBuilder orderBuilder) {
        this.orderID = orderBuilder.getOrderID();
        this.products = orderBuilder.getProducts();
        this.totalPrice = orderBuilder.getTotalPrice();
        this.status = orderBuilder.getStatus();
    }

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public List<String> getProducts() {
        return products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    // ToString method for display
    public String toString() {
        return "Order ID: " + orderID + "\n"
                + "Products: " + products + "\n"
                + "Total Price: " + totalPrice + "\n"
                + "Status: " + status + "\n"
                + "----------------";
    }
}
