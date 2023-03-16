import java.util.List;

class AreaService {
    public static double calculateArea(List<Shape> shapes) {
        double area = 0;

        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}


