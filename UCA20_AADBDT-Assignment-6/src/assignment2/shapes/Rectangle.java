package assignment2.shapes;

import assignment2.model.VectorObject;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Point implements BasicShape{
     private float width, height;
     protected VectorObject childrenShapes = new VectorObject();

     public Rectangle(float x, float y, float width, float height) {
          super(x, y);
          this.width = width;
          this.height = height;
          createObject();
     }

     @Override
     public void draw() {
          childrenShapes.forEach((shape)-> {
               shape.draw();
          });
     }

     private void createObject() {
          childrenShapes.add(new Line(new Point(x, y), new Point(x + width, y)));
          childrenShapes.add(new Line(new Point(x + width, y), new Point(x + width, y + height)));
          childrenShapes.add(new Line(new Point(x + width, y + height), new Point(x, y + height)));
          childrenShapes.add(new Line(new Point(x, y + height), new Point(x, y)));
     }
}