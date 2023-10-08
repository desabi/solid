package examplea;

public class Main {
    public static void main(String[] args) {
        StandardProduct standardProduct = new StandardProduct("pencil", 3.0);
        DiscountedProduct discountedProduct = new DiscountedProduct("notebook", 25.0, 0.15);
        PriceCalculator priceCalculator = new PriceCalculator();

        double standardProductPrice = priceCalculator.calculateTotalCost(standardProduct);
        double discountedProductPrice = priceCalculator.calculateTotalCost(discountedProduct);

        System.out.println("Standard product price: " + standardProductPrice);
        System.out.println("discountedProductPrice = " + discountedProductPrice);
    }
}
