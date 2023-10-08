package examplea;

public class DiscountedProduct extends Product {

    private double discountPercentage;

    public DiscountedProduct(String name, double price, double discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotal() {
        double discountedPrice = getPrice() - (getPrice() * discountPercentage);
        return discountedPrice;
    }
}
