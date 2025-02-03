public class FPaymentMethod implements IPaymentMethod {

    private static IPaymentMethod getPayementMethod(EPaymentMethod type) {
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
}
