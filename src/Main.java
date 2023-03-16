import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2,2);
        shapeList.add(circle);
        shapeList.add(rectangle);
        double returnedAreaValue = AreaService.calculateArea(shapeList);

        System.out.println(returnedAreaValue);
    }
}