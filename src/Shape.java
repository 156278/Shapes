import java.util.ArrayList;
import java.util.HashMap;

public interface Shape {
    void showAll();

    double getArea();

    HashMap<String, Double> getDimensions();

    boolean isSame(Shape compareShape);

}
