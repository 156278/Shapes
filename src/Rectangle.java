import java.util.HashMap;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        System.out.println("Im using an double input");
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width) {
        System.out.println("Im using an integer input");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean isSame(Shape compareShape) {
        if (compareShape.getClass() != Rectangle.class) {

            return false;
        }
        if (((Rectangle) compareShape).getLength() == this.length &&
                ((Rectangle) compareShape).getWidth() == this.width) {
            return true;
        }

        return false;
    }

    @Override
    public void showAll() {
        System.out.println("This rectangle has a length of " + length + " and a width of " + width + " which means the area of the rectangle equals: " + length * width);
    }

    public void showAll(boolean german) {
        System.out.println("Dieses Rechteck hat eine Länge von " + length + " und eine Breite von " + width + ", somit ist die Fläche des Rechtecks " + length * width);
    }

    @Override
    public double getArea() {

        return length * width;
    }

    @Override
    public HashMap<String, Double> getDimensions() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Length", length);
        map.put("Width", width);
        return map;
    }

}
