public class FPaymentMethod implements IPaymentMethod {

    public static IPaymentMethod getPayementMethod(EPaymentMethod type) {
        switch (type) {
            case EPaymentMethod.CRYPTO -> {
                return new CryptoPayement();
            }
            case EPaymentMethod.PAY_PAL -> {
                return new PayPal();
            }
            default -> {
                return new CardPayment();
            }
        }
    }

    @Override
    public void pay(double amount) {
        System.out.println(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return "Payment Method: " + getPayementMethod(EPaymentMethod.CRYPTO);
    }
}
