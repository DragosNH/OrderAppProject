import org.w3c.dom.ls.LSOutput;

import javax.management.Notification;

public class Main {
    public static void main(String[] args) {

        //Les commandes -- Builder
        Order order = new OrderBuilder(1)
                .addProduct("Computer screen", 400)
                .addProduct("Mouse", 20)
                .addProduct("Laptop", 500)
                .setStatus("Sent")
                .build();

        System.out.println(order);

        // Mode de payement -- Factory
        IPaymentMethod paymentMethod = FPaymentMethod.getPaymentMethod(EPaymentMethod.CREDIT_CARD);
        System.out.println(paymentMethod);
        paymentMethod.pay(order.getTotalPrice());

        // Les notifications -- Observer
        ObserverOrder observerOrder = new ObserverOrder();
        observerOrder.addObserver(message -> System.out.println("Notification: " + message));
        observerOrder.notifyTheUsers("Your order has been processed!");
    }
}