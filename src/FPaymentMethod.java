public class FPaymentMethod implements IPaymentMethod {

    public static IPaymentMethod getPaymentMethod(EPaymentMethod type) {
        switch (type) {
            case CRYPTO -> {
                return new CryptoPayment();
            }
            case PAY_PAL -> {
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
