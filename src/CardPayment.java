public class CardPayment implements IPaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by credit card");
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return "Payement method: Credit card";
    }

}
