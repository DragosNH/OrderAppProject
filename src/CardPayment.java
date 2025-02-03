public class CardPayment implements IPaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " by credit card");
    }

    @Override
    public void display() {

    }

}
