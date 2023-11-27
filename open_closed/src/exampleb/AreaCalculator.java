package exampleb;

import java.util.List;

public class AreaCalculator {
    /**
     * Here, the AreaCalculator class takes a list of Shape objects and calculates the total area
     * by calling the calculateArea() method on each shape.
     * This class does not need to be modified when you introduce new shapes because it depends only on the Shape interface,
     * which is open for extension.
     * */
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            System.out.println("Current shape area: " + shape.calculateArea());
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}