package exampleb;

import java.util.Random;

public class Bill {
    private Order order;

    public Bill(Order order) {
        this.order = order;
    }

    public void calculate() {
        /* In the real world, we would want a kind of lookup
          functionality implemented here where we look for
          the price of each item included in the order, add
          them up and add taxes, delivery charges, etc. on
          top to reach the total price. We will simulate
          this behaviour here, by generating a random number
          for total price.
        */
        Random random = new Random();
        int totalAmount = random.nextInt(200) * this.order.getQuantity();
        this.order.setTotalBillAmount(totalAmount);
        System.out.println("Order with order id  " + this.order.getOrderId()
                    + " has a total bill amount of " + this.order.getTotalBillAmount());
    }
}
