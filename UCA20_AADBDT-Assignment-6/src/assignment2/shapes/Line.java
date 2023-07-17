package assignment2.shapes;

public class Line implements BasicShape{
    private Point first, second;

    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void draw() {
        System.out.println("Drawing line from point " + first.toString() +
                " to point " + second.toString());
    }
}
