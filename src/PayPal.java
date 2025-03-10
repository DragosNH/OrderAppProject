public class PayPal implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by Paypal");
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return "Payment method: PayPal";
    }
}
