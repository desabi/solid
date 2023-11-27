package exampleb;

import java.util.List;

// fuente: chatgpt
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        AreaCalculator areaCalculator = new AreaCalculator();

        List<Shape> shapes = List.of(circle, rectangle);
        double calculatedTotalArea = areaCalculator.calculateTotalArea(shapes);
        System.out.println("calculatedTotalArea = " + calculatedTotalArea);
    }
}
