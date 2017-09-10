import java.util.ArrayList;

public class ShapyMcShapeFace {
    ArrayList<Shape> shapes;

    public ShapyMcShapeFace() {
        shapes = new ArrayList<>();

    }

    public void addShape(Shape addShape) {
        for (Shape s : shapes) {
            if (s.isSame(addShape)) {
                return;
            }

            
        }
        shapes.add(addShape);
    }

    public void showAll() {
        for (Shape s : shapes) {
            s.showAll();
        }
    }

}
