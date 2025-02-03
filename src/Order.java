public class Order {

    //Parameters
    private int orderID;
    private String products;
    private int totalPrice;
    private String status;

    public Order(OrderBuilder orderBuilder) {
        this.orderID = orderID;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    //Getters
    public int getOrderID() {
        return orderID;
    }
    public String getProducts() {
        return products;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public String getStatus() {
        return status;
    }

}
