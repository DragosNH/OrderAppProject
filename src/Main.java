import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Order order = new OrderBuilder(1)
                .addProduct("Computer screen", 400)
                .addProduct("Mouse", 20)
                .addProduct("Laptop", 500)
                .setStatus("Sent")
                .build();
        System.out.println(order.toString());

        FPaymentMethod paymentMethod = new FPaymentMethod();
        System.out.println(paymentMethod.toString());
    }
}