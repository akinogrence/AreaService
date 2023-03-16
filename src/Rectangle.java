public class Rectangle extends Shape {

    private double height;
    private double length;

    public Rectangle(double length, double height) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
