import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    Circle c = new Circle(8);
    Circle c2 = new Circle(8);
    Rectangle r = new Rectangle(4,3);
    Triangle t = new Triangle(100, 2000);

    ShapyMcShapeFace s = new ShapyMcShapeFace();
    s.addShape(c);
    s.addShape(c2);
    s.addShape(r);
    s.addShape(t);
    s.showAll();
    }
}

