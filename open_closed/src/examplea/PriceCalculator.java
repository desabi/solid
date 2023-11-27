package examplea;

/**
 * The PriceCalculator class adheres to the OCP because it is open for extension (you can add new product types)
 * but closed for modification (you don't need to modify the existing code when adding new product types).
 * If you want to introduce a new product type, you can simply create a new class that extends Product
 * and provides its own calculateTotal implementation without touching the existing code.
 * */
class PriceCalculator {
    public double calculateTotalCost(Product product) {
        return product.calculateTotal();
    }
}