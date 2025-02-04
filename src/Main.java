import org.w3c.dom.ls.LSOutput;

import javax.management.Notification;

public class Main {
    public static void main(String[] args) {

        Order order = new OrderBuilder(1)
                .addProduct("Computer screen", 400)
                .addProduct("Mouse", 20)
                .addProduct("Laptop", 500)
                .setStatus("Sent")
                .build();

        System.out.println(order);

        IPaymentMethod paymentMethod = FPaymentMethod.getPaymentMethod(EPaymentMethod.CREDIT_CARD);
        System.out.println(paymentMethod);

        paymentMethod.pay(order.getTotalPrice());

        ObserverOrder observerOrder = new ObserverOrder();
        observerOrder.addObserver(message -> System.out.println("Notification: " + message));
        observerOrder.notifyTheUsers("Your order has been processed!");
    }
}