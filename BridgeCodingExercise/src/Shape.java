interface Renderer {
    public String whatToRenderAs();
}

abstract class Shape
{
    private Renderer renderer;
    public String name;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", name, renderer.whatToRenderAs());
    }
}

class VectorRenderer implements Renderer {

    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}

class RasterRenderer implements Renderer {

    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}

class Triangle extends Shape
{
    public Triangle(Renderer renderer) {
        super(renderer);
        name = "Triangle";
    }
}

class Square extends Shape
{
    public Square(Renderer renderer) {
        super(renderer);
        name = "Square";
    }
}

class Demo {
    public static void main(String[] args) {
        String s = new Triangle(new RasterRenderer()).toString();
        System.out.println(s);

    }
}
//class VectorSquare extends Square
//{
//    @Override
//    public String toString()
//    {
//        return String.format("Drawing %s as lines", getName());
//    }
//}
//
//class RasterSquare extends Square
//{
//    @Override
//    public String toString()
//    {
//        return String.format("Drawing %s as pixels", getName());
//    }
//}
//
//// imagine VectorTriangle and RasterTriangle are here too