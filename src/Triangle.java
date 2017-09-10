import java.util.HashMap;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(a * a + b * b);
    }

    @Override
    public void showAll() {
        System.out.println("This triangle has an a of  " + a + " a b of " + b + " and a c of " + c + " which means the area of the triangle equals: " + ((a * b) / 2));

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean isSame(Shape compareShape) {
        if (compareShape.getClass() != Triangle.class) {

            return false;
        }
        if (((Triangle) compareShape).getA() == this.a &&
                ((Triangle) compareShape).getB() == this.b &&
                ((Triangle) compareShape).getC() == this.c) {
            return true;
        }

        return false;
    }

    @Override
    public double getArea() {

        return (a * b) / 2;
    }

    @Override
    public HashMap<String, Double> getDimensions() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("A", a);
        map.put("B", b);
        map.put("C", c);
        return map;
    }
}
