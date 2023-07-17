package assignment2;

import assignment2.shapes.Circle;
import assignment2.shapes.Rectangle;

// Proxy
public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 5, 10);
        circle.draw();

        Rectangle rectangle = new Rectangle(0, 0, 10, 5);
        rectangle.draw();
    }
}
