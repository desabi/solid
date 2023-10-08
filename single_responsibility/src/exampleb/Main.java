package exampleb;

// fuente: https://www.geeksforgeeks.org/single-responsibility-principle-in-java-with-examples/
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Order order = new Order();

        customer.setName("desabisc");
        customer.setAddress("Guerrero");

        order.setItemName("Pizza");
        order.setQuantity(2);
        order.setCustomer(customer);
        order.prepareOrder();

        Bill bill = new Bill(order);
        bill.calculate();

        DeliveryApp deliveryApp = new DeliveryApp(order);
        deliveryApp.delivery();
    }
}
