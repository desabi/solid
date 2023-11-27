package exampleb;

import java.util.List;
public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            System.out.println("Current shape area: " + shape.calculateArea());
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}