public class Main {
    public static void main(String[] args) {

        Order order = new OrderBuilder(1)
                .addProduct("Laptop", 800)
                .addProduct("Mouse", 20)
                .addProduct("Keyboard", 50)
                .setStatus("Confirmed")
                .build();
        System.out.println(order.toString());
    }
}