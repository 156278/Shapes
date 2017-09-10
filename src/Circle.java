import java.util.HashMap;

public class Circle implements Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void showAll() {

        System.out.println("This circle has a radius of " + radius + " and an area of " + area);
    }

    @Override
    public double getArea() {

        return area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean isSame(Shape compareShape) {
        if (compareShape.getClass() != Circle.class) {

            return false;
        }
        if (((Circle) compareShape).getRadius() == this.radius) {
            return true;
        }
        return false;
    }

    @Override
    public HashMap<String, Double> getDimensions() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Radius", radius);
        return map;
    }
}
