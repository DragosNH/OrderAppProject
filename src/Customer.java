import java.util.List;

public class Customer implements INotification{

    private int customerID = 0;
    private String customerName;
    private double customerFounds;
    private List<IPaymentMethod> paymentMethod;
    private List<Order> orders;

    public Customer(int customerID, String customerName, double customerFounds) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerFounds = customerFounds;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerFounds() {
        return customerFounds;
    }

    public Customer display(){
        return this;
    }


    @Override
    public void sendNotification(String message) {
        System.out.println(this.customerName + " you got a new message: " + message);
    }
}
