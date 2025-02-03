import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

    // Parameters
    private int orderID;
    private List<String> products;
    private int totalPrice;
    private String status;

    // Constructor
    public OrderBuilder(int orderID) {
        this.orderID = orderID;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
        this.status = "Pending";
    }

    public OrderBuilder addProduct(String product, int price) {
        this.products.add(product);
        this.totalPrice += price;
        return this;
    }

    public OrderBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public Order build() {
        return new Order(this);
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
}
