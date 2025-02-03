public class CryptoPayement implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Crypto.");
    }

    @Override
    public void display(){}
}
