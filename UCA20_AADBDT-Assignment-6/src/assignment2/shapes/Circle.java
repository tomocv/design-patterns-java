package assignment2.shapes;

public class Circle extends Point implements BasicShape{
    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle of radius " + radius +
                " around point " + super.toString());
    }
}
