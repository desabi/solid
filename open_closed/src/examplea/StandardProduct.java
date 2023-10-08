package examplea;

public class StandardProduct extends Product {

    public StandardProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTotal() {
        return getPrice();
    }
}
