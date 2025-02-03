public class OrderBuilder {

    //Parameters
    private int orderID;
    private String products;
    private int totalPrice;
    private String status;

    //Constructor
    public OrderBuilder(int orderID, String products, int totalPrice, String status) {
        this.orderID = orderID;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    // Build function
    public Order build() {
        return new Order(this);
    }

}
